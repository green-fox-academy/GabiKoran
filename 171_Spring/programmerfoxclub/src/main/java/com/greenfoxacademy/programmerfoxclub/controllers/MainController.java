package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    private FoxService foxService;

    @Autowired
    public MainController(FoxService foxService) {
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String index(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("fox", foxService.find(name));
        if (foxService.find(name).getTricks() == null || foxService.find(name).getTricks().size() == 0) {
            model.addAttribute("error1", "You know no tricks, yet. Go and learn some.");
        }
        if (foxService.find(name).getActions().isEmpty()) {
            model.addAttribute("error2", "You have not any actions, yet. So do something. Let's learn, drink or eat. Welcome.");
        } else {
            model.addAttribute("actions", foxService.find(name).getLastFiveActions());
            System.out.println(foxService.find(name).getLastFiveActions().toString());
        }
        return "index";
    }

    @GetMapping("/login")
    public String loginGet() {
        return "login";
    }

    @PostMapping("/login")
    public String loginPost(@RequestParam String name) {
        return "redirect:/?name=" + name;
    }
}
