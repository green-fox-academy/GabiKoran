package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRESTController {

    @RequestMapping(value="/greeting", method= RequestMethod.GET)
    public Greeting greeting(@RequestParam(value = "name", required = false)String name, Model model) {
        if (name == null) {
            name = "Mr. Stranger";
        }
        model.addAttribute("name", name);
            return new Greeting(1, "Hello, " + name + "!");
    }

}
