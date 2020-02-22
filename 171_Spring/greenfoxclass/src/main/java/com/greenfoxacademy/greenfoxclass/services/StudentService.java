package com.greenfoxacademy.greenfoxclass.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    ArrayList<String> names;

    public StudentService() {
        names = new ArrayList<>();
        names.add("Sanyi");
        names.add("Lilla");
        names.add("John");
    }

    public List<String> findAll() {
        return names;
    }

    public void save(String student) {
        names.add(student);
    }

    public String renderSave(String student) {
        if (student == null) {
            return "Please give the name.";
        } else {
            save(student);
            return " has been saved to the Students' list.";
        }
    }

    public int count() {
        return names.size();
    }
}