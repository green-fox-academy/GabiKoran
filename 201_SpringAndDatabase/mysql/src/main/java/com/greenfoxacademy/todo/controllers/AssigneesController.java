package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/assignees")
public class AssigneesController {

    private AssigneeService assigneeService;

    @Autowired
    public AssigneesController(AssigneeService assigneeService) {
        this.assigneeService = assigneeService;
    }

    @RequestMapping(value={"/list", "/", ""}, method= RequestMethod.GET)
    public String listAssignees(Model model) {
        if (assigneeService.findAll() != null) {
            model.addAttribute("assigness", assigneeService.findAll());
        } else {
            model.addAttribute("error", "We haven't any assignees, yet.");
        }
        return "assignees";
    }
}
