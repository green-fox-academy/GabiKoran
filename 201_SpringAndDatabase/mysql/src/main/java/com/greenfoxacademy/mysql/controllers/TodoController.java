package com.greenfoxacademy.mysql.controllers;

import com.greenfoxacademy.mysql.repositories.TodoRepository;
import com.greenfoxacademy.mysql.services.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value={"/list", "/", ""}, method= RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("todos", todoService.findAllActive());
        return "todolist";
    }
}
