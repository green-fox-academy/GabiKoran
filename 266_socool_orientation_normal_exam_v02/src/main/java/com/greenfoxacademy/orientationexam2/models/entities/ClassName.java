package com.greenfoxacademy.orientationexam2.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "class_names")
public class ClassName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
//    @OneToMany(mappedBy = "className", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    @OneToMany
    private List<Mentor> mentors;

    public ClassName() {
        this.mentors = new ArrayList<>();
    }

    public ClassName(String name) {
        this();
        this.name = name;
    }

    public ClassName(String name, List<Mentor> mentors) {
        this.name = name;
        this.mentors = mentors;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(List<Mentor> mentors) {
        this.mentors = mentors;
    }

    public void addMentor(Mentor mentor) {
        this.mentors.add(mentor);
    }
}
