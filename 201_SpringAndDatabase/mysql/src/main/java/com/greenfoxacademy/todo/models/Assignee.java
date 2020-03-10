package com.greenfoxacademy.todo.models;

import javax.persistence.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "assignees")
public class Assignee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    @JoinTable(name = "assigneeship")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Todo> todos;

    public Assignee(String name, String email) {
        this.name = name;
        this.email = email;
        this.todos = new ArrayList<>();
    }

    public Assignee() {
        this.todos = new ArrayList<>();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
        todos.stream().forEach(todo -> todo.setAssignee(this));
    }

    public void addTodo(Todo todo) {
        this.todos.add(todo);
    }
}
