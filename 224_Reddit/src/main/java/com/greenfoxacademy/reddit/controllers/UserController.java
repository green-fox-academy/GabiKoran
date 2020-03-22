package com.greenfoxacademy.reddit.controllers;

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

    @GetMapping("/")
    public String startPage() {
        return "redirect:/login";
    }


    @GetMapping("/login")
    public String renderLoginPage(Model model, @RequestParam(required = false) String loginerror) {
        if (loginerror != null) {
            model.addAttribute("loginerror", loginerror);
        }
        return "/login";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute (name = "email") String email, @ModelAttribute (name = "password") String password) {
        return userService.getLoginPath(email, password);
    }

}
