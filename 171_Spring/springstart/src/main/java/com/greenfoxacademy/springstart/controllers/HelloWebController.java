package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWebController {

    @GetMapping("/web/greeting")
    @ResponseBody
    public String greeting(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name == null) {
            name = "World";
        }
        model.addAttribute("name", " World");
        return "Hello, " + name + "! (It is a web page.)";
    }
}
