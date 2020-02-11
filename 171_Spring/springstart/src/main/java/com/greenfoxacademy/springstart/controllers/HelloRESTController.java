package com.greenfoxacademy.springstart.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloRESTController {

    private static final String greetingText = "Hello, ";
    private static AtomicLong Counter = new AtomicLong();

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting greeting(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name == null) {
            name = "Mr. Stranger";
        }
        model.addAttribute("name", name);
        return new Greeting(Counter.incrementAndGet(), greetingText + name + "!");
    }

}