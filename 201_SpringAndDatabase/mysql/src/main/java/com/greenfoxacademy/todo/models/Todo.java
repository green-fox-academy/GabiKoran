package com.greenfoxacademy.todo.models;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table (name = "todos")
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "title")
    private String title;
    private boolean isUrgent;
    private boolean isDone;
//    @ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne
    private Assignee assignee;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate creationDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dueDate;

    public Todo(String title, boolean isUrgent, boolean isDone, Assignee assignee) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        this.assignee = assignee;
        this.creationDate = LocalDate.now();
    }

    public Todo(String title, boolean isUrgent, boolean isDone) {
        this.title = title;
        this.isUrgent = isUrgent;
        this.isDone = isDone;
        this.creationDate = LocalDate.now();

    }

    public Todo(String title) {
        this.title = title;
        this.creationDate = LocalDate.now();
    }

    public Todo() {
        this.creationDate = LocalDate.now();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean getIsUrgent() {
        return isUrgent;
    }

    public void setIsUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    public boolean getIsDone() {
        return isDone;
    }

    public void setIsDone(boolean done) {
        isDone = done;
    }

    public Assignee getAssignee() {
        return assignee;
    }

    public void setAssignee(Assignee assignee) {
        this.assignee = assignee;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return title;
    }
}
