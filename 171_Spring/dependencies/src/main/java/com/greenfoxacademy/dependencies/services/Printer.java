package com.greenfoxacademy.dependencies.services;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

// Use the Printer class as a base to let Spring create a dependency from it.
@Service
public class Printer {
    public void log(String message) {
        System.out.println(LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}
