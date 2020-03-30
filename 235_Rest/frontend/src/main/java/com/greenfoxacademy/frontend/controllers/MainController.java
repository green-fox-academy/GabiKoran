package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Doubling;
import com.greenfoxacademy.frontend.models.ErrorMessage;
import com.greenfoxacademy.frontend.models.Greeting;
import com.greenfoxacademy.frontend.services.MainService;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private MainService mainService;

    @Autowired
    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/doubling")
    public ResponseEntity doubling(@RequestParam(required = false) Integer input)  {
        return mainService.doubling(input);
    }

    @GetMapping("/greeter")
    public ResponseEntity greeting(@RequestParam (required = false) String name, @RequestParam (required = false) String title) {
        return mainService.greeting(name, title);
    }
}
