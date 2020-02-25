package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private ArrayList<String> tricks;
    private String food;
    private String drink;

    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = "-";
        this.drink = "-";
    }

    public Fox(String name, ArrayList<String> tricks, String food, String drink) {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
    }

    public void addTrick(String trick) {
        tricks.add(trick);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getTricks() {
        return tricks;
    }

    public void setTricks(ArrayList tricks) {
        this.tricks = tricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink;
    }

    public boolean tricksIsEmpty() {
        if (this.getTricks().isEmpty() || this.getTricks() == null) {
            return false;
        } else {
            return true;
        }
    }
}
