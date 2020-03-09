package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/assignee")
public class AssigneesController {

    private AssigneeService assigneeService;

    @Autowired
    public AssigneesController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @GetMapping("/assignees")
    public String listAssignees(Model model) {
        model.addAttribute("assigness", assigneeService.findAll());
        return "assignees";
    }
}
