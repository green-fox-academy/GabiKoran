package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.repositories.TodoRepository;
import com.greenfoxacademy.mysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value={"/list", "/", ""}, method= RequestMethod.GET)
    public String list(@RequestParam (required = false) String isActive, Model model) {
        if (isActive == null) {
            model.addAttribute("todos", todoService.findAll());
        } else if (isActive.toLowerCase().equals("true")) {
            model.addAttribute("todos", todoService.findAllActive());
        } else if (isActive.toLowerCase().equals("false")) {
            model.addAttribute("todos", todoService.findAllDone());
        } else {
            model.addAttribute("error", "Please write a valid request.");
        }
        return "todolist";
    }
}
