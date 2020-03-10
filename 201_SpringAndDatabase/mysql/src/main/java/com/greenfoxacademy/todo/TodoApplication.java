package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.AssigneeRepository;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    private TodoRepository todoRepository;
    private AssigneeRepository assigneeRepository;

    @Autowired
    public TodoApplication(TodoRepository todoRepository, AssigneeRepository assigneeRepository) {
        this.todoRepository = todoRepository;
        this.assigneeRepository = assigneeRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        todoRepository.save(new Todo("aaa"));
        todoRepository.save(new Todo("bbb", true, false));
        todoRepository.save(new Todo("ccc", true, true));
        todoRepository.save(new Todo("ddd", true, false));
        todoRepository.save(new Todo("eee", true, true));
        todoRepository.save(new Todo("fff", true, true));
        todoRepository.save(new Todo("ggg", true, true));
        todoRepository.save(new Todo("hhh", true, false));
        todoRepository.save(new Todo("iii", true, true));
        todoRepository.save(new Todo("jjj", true, true));

        assigneeRepository.save(new Assignee("Csenge", "csenge@gmail.com"));
        assigneeRepository.save(new Assignee("Hajni", "hajni@gmail.com"));
        assigneeRepository.save(new Assignee("Dóri", "dori@gmail.com"));
        assigneeRepository.save(new Assignee("Viki", "viki@gmail.com"));
        assigneeRepository.save(new Assignee("Johi", "johi@gmail.com"));
        assigneeRepository.save(new Assignee("Eszter", "eszter@gmail.com"));
    }
}
