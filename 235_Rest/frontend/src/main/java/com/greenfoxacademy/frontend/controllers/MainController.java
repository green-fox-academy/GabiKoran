package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.*;
import com.greenfoxacademy.frontend.services.LogService;
import com.greenfoxacademy.frontend.services.MainService;
import jdk.nashorn.internal.runtime.regexp.joni.exception.ErrorMessages;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private MainService mainService;
    private LogService logService;

    @Autowired
    public MainController(MainService mainService, LogService logService) {
        this.mainService = mainService;
        this.logService = logService;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/doubling")
    public ResponseEntity doubling(@RequestParam(required = false) Integer input)  {
        logService.save(new Log("GET", "doubling", "input=" + input));
        return mainService.doubling(input);
    }

    @GetMapping("/greeter")
    public ResponseEntity greeting(@RequestParam (required = false) String name, @RequestParam (required = false) String title) {
        logService.save(new Log("GET", "greeting", "name=" + name + "&title=" + title));
        return mainService.greeting(name, title);
    }

    @GetMapping("/appenda/{appendable}")
    public ResponseEntity appenda(@PathVariable String appendable) {
        logService.save(new Log("GET", "appenda", "appendable=" + appendable));
        return ResponseEntity.status(200).body(new Appenda(appendable));
    }

    @PostMapping("/dountil/{action}")
    public ResponseEntity doUntil(@PathVariable String action, @RequestBody DoUntil doUntil) {
        logService.save(new Log("POST", "doUntil", "action=" + action + "&doUntil=" + doUntil.toString()));
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
        logService.save(new Log("POST", "arrays", "arrayHandler=" + arrayHandler));
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

     @GetMapping("/log")
    public ResponseEntity logs() {
        logService.save(new Log("GET", "log"));
        return ResponseEntity.status(200).body(new LogList(logService.listLogs()));
     }
}
