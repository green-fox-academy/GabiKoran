package com.greenfoxacademy.programmerfoxclub.services;

import com.greenfoxacademy.programmerfoxclub.models.Fox;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class FoxService {

    private ArrayList<Fox> foxes;

    public FoxService() {
        foxes = new ArrayList<>();
        foxes.add(new Fox("Mr. Green", new ArrayList(), "salad", "water"));
        foxes.add(new Fox("Vuk"));
        foxes.add(new Fox("Karak"));
        foxes.add(new Fox("Csele", new ArrayList(), "salad", "water"));
    }

    public ArrayList<Fox> findAll() {
        return foxes;
    }

    public Fox find(String name) {
        Fox searchedFox = null;
        for (Fox fox : foxes) {
            if (fox.getName().equals(name)) {
                searchedFox = fox;
            }
        }
        return searchedFox;
    }

    public void save(Fox fox) {
        foxes.add(fox);
    }

    public void save(String name) {
        foxes.add(new Fox(name));
    }
}
