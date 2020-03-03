package com.greenfoxacademy.mysql.services;

import com.greenfoxacademy.mysql.models.Todo;
import com.greenfoxacademy.mysql.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {

    private TodoRepository todoRepository;

    @Autowired
    public TodoService (TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Iterable<Todo> findAll() {
        return todoRepository.findAll();
    }

    public Iterable<Todo> findAllByIsDone() {
        return todoRepository.findAllByIsDone(true);
    }

    public Iterable<Todo> findAllByIsNotDone() {
        return todoRepository.findAllByIsDone(false);
    }

    public void add(String title) {
        todoRepository.save(new Todo(title));
    }

    public void deleteById(Long id) {
        todoRepository.deleteById(id);
    }
}
