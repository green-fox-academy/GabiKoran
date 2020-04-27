package com.greenfoxacademy.orientationexam2.controllers;

import com.greenfoxacademy.orientationexam2.models.DTOs.MentorDTO;
import com.greenfoxacademy.orientationexam2.models.entities.Mentor;
import com.greenfoxacademy.orientationexam2.services.ClassNameService;
import com.greenfoxacademy.orientationexam2.services.MentorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class MentorRateMainController {

    private MentorService mentorService;
    private ClassNameService classNameService;

    public MentorRateMainController(MentorService mentorService, ClassNameService classNameService) {
        this.mentorService = mentorService;
        this.classNameService = classNameService;
    }

    @GetMapping("/")
    public String renderMainPage(Model model) {
        model.addAttribute("mentors", mentorService.listMentors());
        model.addAttribute("schoolClasses", classNameService.listClassNames());
        return "index";
    }

    @PostMapping("/mentor")
    public String saveNewMentor(@ModelAttribute MentorDTO mentor) {
        if (mentorService.isNameAlreadyTaken(mentor.getName())) {
            return "redirect:/err?error=taken-name";
        } else {
            return "redirect:/mentor/" + mentorService.saveNewMentorWithClassNameAndGetItsId(mentor);
        }
    }

    @GetMapping("/err")
    public String renderErrorPage(@RequestParam(required = false) String error, Model model) {
        if (error != null) {
            switch (error) {
                case "taken-name":
                    model.addAttribute("error", "The mentor already exists in the database.");
                    break;
                case "invalid-mentor":
                    model.addAttribute("error", "The mentor with the given ID does not exist.");
                    break;
                default:
                    model.addAttribute("error", "Unkown error.");
            }
        }
        return "error";
    }

    @GetMapping("/mentor/{id}")
    public String renderMentorPage(Model model, @PathVariable(name = "id") Long id) {
        Optional<Mentor> inputMentor = mentorService.findMentorById(id);
        if (inputMentor.isPresent()) {
            model.addAttribute("mentor", inputMentor.get());
            return "mentor";
        } else {
            return "redirect:/err?error=invalid-mentor";
        }
    }
}
