package com.greenfoxacademy.dependencies.usefullutilities.controllers;

import com.greenfoxacademy.dependencies.usefullutilities.services.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UtilityController {

    private UtilityService utilityService;

    @Autowired
    public UtilityController(UtilityService utilityService) {
        this.utilityService = utilityService;
    }

    @GetMapping("/useful")
    public String usefulLinks () {
        return "links";
    }

    @GetMapping("/useful/colored")
    public String colored(Model model) {
        model.addAttribute("color", utilityService.randomColor());
        return "colored";
    }

    @GetMapping("/useful/email")
    public String validateEmail(@RequestParam (required = false) String email, Model model) {

        if (email != null) {
            model.addAttribute("email", email);
            model.addAttribute("text", utilityService.validateEmail(email) ? " is a valid email address" : " is not a valid email address");
            model.addAttribute("color", utilityService.validateEmail(email) ? "green" : "red");
        } else {
            model.addAttribute("error", "No email was given.");
        }

        return "email";
    }

    @GetMapping("/useful/caesar_encoder")
    public String caesarEncoding(@RequestParam (required = false) String text, @RequestParam (required = false) Integer number, Model model) {
        model.addAttribute("text", utilityService.renderCaesar(text, number, true));
        return "caesar";
    }

    @GetMapping("/useful/caesar_decoder")
    public String caesarDecoding(@RequestParam (required = false) String text, @RequestParam (required = false) Integer number, Model model) {
        model.addAttribute("text", utilityService.renderCaesar(text, number, false));
        return "caesar";
    }
}
