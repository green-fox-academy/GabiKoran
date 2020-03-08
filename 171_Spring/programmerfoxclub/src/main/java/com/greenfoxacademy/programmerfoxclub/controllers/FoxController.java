package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.models.Trick;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FoxController {

    private FoxService foxService;

    @Autowired
    public FoxController(FoxService foxService) {
        this.foxService = foxService;
    }


    @GetMapping("/nutritionstore")
    public String nutritionStoreForm(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        model.addAttribute("foods", Food.values());
        model.addAttribute("drinks", Drink.values());
        model.addAttribute("currentFood", foxService.find(name).getFood());
        model.addAttribute("currentDrink", foxService.find(name).getDrink());
        model.addAttribute("active", "nutritionstore");
        return "nutritionstore";
    }

    @PostMapping("/nutritionstore")
    public String nutritionStore(@RequestParam String name, @ModelAttribute(name="food") Food food, @ModelAttribute(name="drink") Drink drink) {
        foxService.find(name).setFood(food.toString().toLowerCase());
        foxService.find(name).addAction(" : Food has been changed from: " + foxService.find(name).getPreviousFood() + " to: " + food.toString().toLowerCase());
        foxService.find(name).setDrink(drink.toString().toLowerCase());
        foxService.find(name).addAction(" : Drink has been changed from: " + foxService.find(name).getPreviousDrink() + " to: " + drink.toString().toLowerCase());
        return "redirect:/?name=" + name;
    }

    @GetMapping("/trickcenter")
    public String trickCenterForm(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        if (foxService.find(name).getUnknownTricks().isEmpty()) {
            model.addAttribute("message", "You know everything. Have a rest.");
        } else {
            model.addAttribute("tricks", foxService.find(name).getUnknownTricks());
        }
        model.addAttribute("active", "trickcenter");
        return "trickcenter";
    }

    @PostMapping("/trickcenter")
    public String trickCenter(@RequestParam String name, @ModelAttribute(name="trick") Trick trick) {
        foxService.find(name).addTrick(trick.toString());
        foxService.find(name).addAction(" : Learned to: " + trick.toString().toLowerCase());
        return "redirect:/?name=" + name;
    }

    @GetMapping("/actionhistory")
    public String actionHistory(@RequestParam String name, Model model) {
        model.addAttribute("name", name);
        if (foxService.find(name).getActions().isEmpty()) {
            model.addAttribute("error", "You have not any actions, yet. So do something. Let's learn, drink or eat. Welcome.");
        } else {
            model.addAttribute("actions", foxService.find(name).getActions());
        }
        model.addAttribute("active", "actionhistory");
        return "actionhistory";
    }
}
