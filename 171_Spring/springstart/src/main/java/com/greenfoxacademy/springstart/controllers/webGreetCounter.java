package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class webGreetCounter {

    private static AtomicLong GreetingCounter = new AtomicLong();

    @GetMapping("/web/greetCounter")
    public String greetingCounter(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name == null) {
            name = "You";
        }
        model.addAttribute("name", name);
        model.addAttribute("counter", GreetingCounter.incrementAndGet());
        return "greetingCounter";
    }

}
