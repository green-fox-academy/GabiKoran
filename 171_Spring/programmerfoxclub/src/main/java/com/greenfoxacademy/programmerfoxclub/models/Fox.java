package com.greenfoxacademy.programmerfoxclub.models;

import java.util.ArrayList;
import java.util.List;

public class Fox {

    private String name;
    private ArrayList<String> tricks;
    private String food;
    private String drink;
    private ArrayList<String> unknownTricks;

    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = "-";
        this.drink = "-";
        this.unknownTricks = new ArrayList<>();
        for (Trick trick : Trick.values()) {
            unknownTricks.add(trick.toString());
        }
    }

    public Fox(String name, ArrayList<String> tricks, String food, String drink) {
        this.name = name;
        this.tricks = tricks;
        this.food = food;
        this.drink = drink;
        this.unknownTricks = new ArrayList<>();
        for (Trick trick : Trick.values()) {
            unknownTricks.add(trick.toString());
        }
    }

    public void addTrick(String trick) {
        if (!tricks.contains(trick)) {
            tricks.add(trick);
            unknownTricks.remove(trick.toString());
        }
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

    public void setTricks(ArrayList<String> tricks) {
        this.tricks = tricks;
    }

    public ArrayList<String> getUnknownTricks() {
        return unknownTricks;
    }

    public void setUnknownTricks(ArrayList<String> unknownTricks) {
        this.unknownTricks = unknownTricks;
    }

    public boolean tricksIsEmpty() {
        if (this.getTricks().isEmpty() || this.getTricks() == null) {
            return false;
        } else {
            return true;
        }
    }
}
