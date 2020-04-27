package com.greenfoxacademy.orientationexam2.models.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.greenfoxacademy.orientationexam2.repositories.ClassNameRepository;

import javax.persistence.*;

@Entity
@Table(name = "mentors")
public class Mentor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String name;
    @ManyToOne
    private ClassName className;

    public Mentor() {
    }

    public Mentor(String name) {
        this.name = name;
    }

    public Mentor(String name, ClassName className) {
        this.name = name;
        this.className = className;
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

    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
        className.addMentor(this);
    }
}