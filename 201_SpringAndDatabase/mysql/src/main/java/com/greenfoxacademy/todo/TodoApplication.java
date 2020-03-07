package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    private TodoRepository todoRepository;

    @Autowired
    public TodoApplication(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("I have to learn Object Relational Mapping"));
        todoRepository.save(new Todo("Drill the swing to the ceiling", true, false));
        todoRepository.save(new Todo("Change the text on the bicycle", true, true));
        todoRepository.save(new Todo("Take back the books to the library", true, false));
        todoRepository.save(new Todo("Apply for GYES", true, true));
        todoRepository.save(new Todo("Register to the school admissions", true, true));
    }
}
