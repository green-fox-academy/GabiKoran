package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.*;
import com.greenfoxacademy.frontend.services.MainService;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity appenda(@PathVariable String appendable) {
        return ResponseEntity.status(200).body(new Appenda(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity doUntil(@PathVariable String action, @RequestBody DoUntil doUntil) {
        if (doUntil == null) {
            return ResponseEntity.status(400).body(new ErrorMessage("Please provide a number!"));
        } else if (action.equals("sum") || action.equals("factor")) {
            return ResponseEntity.status(200).body(new Result(mainService.action(action, doUntil)));
        } else {
            return ResponseEntity.status(400).body(new ErrorMessage("No action found"));
        }
    }

     @PostMapping("/arrays")
    public ResponseEntity arrays(@RequestBody ArrayHandler arrayHandler) {
         if (arrayHandler.getWhat().equals("sum")) {
             return ResponseEntity.status(200).body(new Result(arrayHandler.sum()));
         } else if (arrayHandler.getWhat().equals("multiply")) {
             return ResponseEntity.status(200).body(new Result(arrayHandler.multiply()));
        } else if (arrayHandler.getWhat().equals("double")) {
            return ResponseEntity.status(200).body(new ResultArray(arrayHandler.doubleArray()));
         } else {
             return ResponseEntity.status(400).body(new ErrorMessage("Please provide what to do with the numbers!"));
         }
     }
}
