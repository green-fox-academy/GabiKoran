package com.greenfoxacademy.greenfoxclass.controllers;

import com.greenfoxacademy.greenfoxclass.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;

@Controller
public class StudentController {

    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
       this.studentService = studentService;
    }

    @GetMapping("/gfa")
    public String mainPage(Model model) {
        model.addAttribute("count", studentService.count());
        return "gfa";
    }

    @GetMapping("/gfa/list")
    public String listStudents(Model model) {
        model.addAttribute("names", studentService.findAll());
        return "list";
    }

    @GetMapping("/gfa/add")
    public String addNewStudent() {
        return "add";
    }

    @PostMapping("/gfa/save")
    public String addNewStudentSave(Model model, @ModelAttribute(name = "name") String name) {
        model.addAttribute("text", studentService.renderSave(name));
        model.addAttribute("name", name);
        return "save";
    }

    @GetMapping("/gfa/check")
    public String check() {
        return "check";
    }

    @PostMapping("/gfa/check-answer")
    public String checkPost(Model model, @ModelAttribute(name = "name") String name) {
        model.addAttribute("text", studentService.check(name)?"Yes, " + name + " is a student.":"No, " + name + " isn't greenfox student.");
        return "check-answer";
    }
}
