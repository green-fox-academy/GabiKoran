package com.greenfoxacademy.reddit.controllers;

import com.greenfoxacademy.reddit.models.entities.User;
import com.greenfoxacademy.reddit.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(path = {"", "/login"})
    public String renderLoginPage(Model model, @RequestParam(required = false) String error) {
        if (error != null) {
            switch (error) {
                case "invalid-login":
                    model.addAttribute("loginerror", "Invalid email or password.");
                    break;
                case "signup-email":
                    model.addAttribute("signuperror", "This email was registered earlier.");
                    break;
                case "signup-password":
                    model.addAttribute("signuperror", "Please check the password.");
                    break;
                default:
                    model.addAttribute("loginerror", "Unknown error.");
                    model.addAttribute("signuperror", "Unknown error.");
            }
        }
        return "login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute(name = "email") String email, @ModelAttribute(name = "password") String password) {
        if (userService.isEmailRegistered(email) && userService.isEmailAndPasswordCorrect(email, password)) {
            return "redirect:/" + userService.getUserByEmail(email).getId();
        } else {
            return "redirect:/login?error=invalid-login";
        }
    }

    @PostMapping("/signup")
    public String signup(String name, String email, String password, String password2) {
        if (userService.isEmailRegistered(email)) {
            return "redirect:/login?error=signup-email";
        } else if (!password.equals(password2)) {
            return "redirect:/login?error=signup-password";
        } else {
            userService.save(new User(name, email, password));
            return "redirect:/" + userService.getUserByEmail(email).getId();
        }
    }
}
