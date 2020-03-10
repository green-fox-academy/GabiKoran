package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.services.AssigneeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/addAssignee")
    public String addForm() {
        return "addAssignee";
    }

    @PostMapping("/addAssignee")
    public String add(@ModelAttribute(name="name") String name, @ModelAttribute(name="email") String email) {
        assigneeService.add(name, email);
        return "redirect:/assignees";
    }

    @PostMapping("/{id}/delete")
    public String deleteTodoById(@PathVariable Long id) {
        assigneeService.deleteById(id);
        return "redirect:/assignees";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("assignee", assigneeService.findAssigneeById(id));
        model.addAttribute("name", assigneeService.findAssigneeById(id).getName());
        model.addAttribute("name", assigneeService.findAssigneeById(id).getEmail());
        return "editAssignee";
    }

    @PostMapping("/{id}/edit")
    public String edit(@PathVariable Long id, String name, String email) {
        assigneeService.findAssigneeById(id).setName(name);
        assigneeService.findAssigneeById(id).setEmail(email);
        assigneeService.edit(assigneeService.findAssigneeById(id));
        return "redirect:/assignees";
    }
}
