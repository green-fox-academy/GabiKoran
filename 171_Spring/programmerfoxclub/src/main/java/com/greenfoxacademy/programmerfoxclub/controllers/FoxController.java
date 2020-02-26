package com.greenfoxacademy.programmerfoxclub.controllers;

import com.greenfoxacademy.programmerfoxclub.models.Drink;
import com.greenfoxacademy.programmerfoxclub.models.Food;
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
        return "nutritionstore";
    }

    @PostMapping("/nutritionstore")
    public String nutritionStore(@RequestParam (required = false) String name, @ModelAttribute(name="food") Food food, @ModelAttribute(name="drink") Drink drink) {
        foxService.find(name).setFood(food.toString().toLowerCase());
        foxService.find(name).setDrink(drink.toString().toLowerCase());
        return "redirect:/?name=" + name;
    }
}
