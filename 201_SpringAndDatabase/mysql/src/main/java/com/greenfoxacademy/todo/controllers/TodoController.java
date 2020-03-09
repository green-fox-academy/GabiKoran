package com.greenfoxacademy.todo.controllers;

import com.greenfoxacademy.todo.services.TodoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @RequestMapping(value={"/list", "/", ""}, method= RequestMethod.GET)
    public String list(@RequestParam (required = false) String isActive, Model model, @RequestParam (required = false) String search) {
        if (search != null) {
            model.addAttribute("todos", todoService.findAllByTitleContains(search));
        } else if (isActive == null) {
            model.addAttribute("todos", todoService.findAll());
        } else if (isActive.toLowerCase().equals("true")) {
            model.addAttribute("todos", todoService.findAllByIsNotDone());
        } else if (isActive.toLowerCase().equals("false")) {
            model.addAttribute("todos", todoService.findAllByIsDone());
        } else {
            model.addAttribute("error", "Please write a valid query.");
        }
        return "todolist";
    }

    @PostMapping("/{id}/delete")
    public String deleteTodoById(@PathVariable Long id) {
        todoService.deleteById(id);
        return "redirect:/todo";
    }

    @GetMapping("/add")
    public String addForm() {
        return "add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute(name="title") String title) {
        todoService.add(title);
        return "redirect:/todo";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable Long id, Model model) {
        model.addAttribute("id", id);
        model.addAttribute("todo", todoService.findTodoById(id));
        model.addAttribute("title", todoService.findTodoById(id).getTitle());
        return "edit";
    }

    @PostMapping("/{id}/edit")
    public String edit(@PathVariable Long id, String title, Boolean isUrgent,  Boolean isDone) {
        if (isUrgent == null) {
            isUrgent = false;
        }
        if (isDone == null) {
            isDone = false;
        }
        todoService.findTodoById(id).setTitle(title);
        todoService.findTodoById(id).setIsUrgent(isUrgent);
        todoService.findTodoById(id).setIsDone(isDone);
        todoService.edit(todoService.findTodoById(id));
        return "redirect:/todo";
    }
}
