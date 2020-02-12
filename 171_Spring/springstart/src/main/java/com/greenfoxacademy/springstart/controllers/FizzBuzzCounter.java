package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.concurrent.atomic.AtomicLong;

@Controller
public class FizzBuzzCounter {

    private static AtomicLong fizzBuzzCounter = new AtomicLong();

    @GetMapping("/fizzBuzzCounter")
    public String fizzBuzzCounter(Model model) {

        long n = fizzBuzzCounter.incrementAndGet();
        String counter = n + "";
        int fontSize = 18;

        for (int i = 1; i <= n; i++) {
            if ((i % 105) == 0) {
                counter = "FizzBuzzWoof";
                fontSize = 72;
            } else if ((i % 15) == 0) {
                counter = "FizzBuzz";
                fontSize = 48;
            } else if ((i % 35) == 0) {
                counter = "BuzzWoof";
                fontSize = 48;
            } else if ((i % 21) == 0) {
                counter = "FizzWoof";
                fontSize = 48;
            } else if ((i % 3) == 0) {
                counter = "Fizz";
                fontSize = 24;
            } else if ((i % 5) == 0) {
                counter = "Buzz";
                fontSize = 24;
            } else if ((i % 7) == 0) {
                counter = "Woof";
                fontSize = 24;
            } else {
                counter = n + "";
                fontSize = 18;
            }
        }

        model.addAttribute("counter", counter);
        model.addAttribute("fontSize", fontSize);

        return "fizzBuzzCounter";
    }

}
