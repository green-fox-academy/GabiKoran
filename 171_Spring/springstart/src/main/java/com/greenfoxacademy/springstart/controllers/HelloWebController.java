package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloWebController {

    @GetMapping("/web/greeting")
    public String greeting(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name == null) {
            name = "World";
        }
        model.addAttribute("name", name);
        return "greeting";
    }
}