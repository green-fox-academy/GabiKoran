package com.greenfoxacademy.greenfoxclass.controllers;

import com.greenfoxacademy.greenfoxclass.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
       this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String mainPage() {
        return "gfa";
    }

    @GetMapping("/gfa/list")
    public String listStudents(Model model) {
        model.addAttribute("names", studentService.findAll());
        return "list";
    }
}
