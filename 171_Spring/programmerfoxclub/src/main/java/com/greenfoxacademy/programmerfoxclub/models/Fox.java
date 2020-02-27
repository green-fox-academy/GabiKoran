package com.greenfoxacademy.programmerfoxclub.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Fox {

    private String name;
    private ArrayList<String> tricks;
    private String food;
    private String drink;
    private ArrayList<String> unknownTricks;
    private ArrayList<String> actions;
    private String previousFood;
    private String previousDrink;

    public Fox(String name) {
        this.name = name;
        this.tricks = new ArrayList<>();
        this.food = "-";
        this.drink = "-";
        this.unknownTricks = new ArrayList<>();
        for (Trick trick : Trick.values()) {
            unknownTricks.add(trick.toString());
        }
        actions = new ArrayList<>();
        this.previousFood = "-";
        this.previousDrink = "-";
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
        actions = new ArrayList<>();
        this.previousFood = "-";
        this.previousDrink = "-";
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

    public ArrayList<String> getTricks() {
        return tricks;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.previousFood = this.food;
        this.food = food;
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.previousDrink = this.drink;
        this.drink = drink;
    }

    public ArrayList<String> getActions() {
        return actions;
    }

    public void setTricks(ArrayList<String> tricks) {
        this.tricks = tricks;
    }

    public ArrayList<String> getUnknownTricks() {
        return unknownTricks;
    }

    public boolean tricksIsEmpty() {
        if (this.getTricks().isEmpty() || this.getTricks() == null) {
            return false;
        } else {
            return true;
        }
    }

    public void addAction(String action) {
        Date date = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy. MMMMMMMM dd. hh:mm:ss ");
        actions.add((ft.format(date)).toString().toLowerCase() + action);
    }

    public String getPreviousFood() {
        return previousFood;
    }

    public String getPreviousDrink() {
        return previousDrink;
    }
}
