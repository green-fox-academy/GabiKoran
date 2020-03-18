package com.greenfoxacademy.todo;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.AssigneeRepository;
import com.greenfoxacademy.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

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
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));

//        Assignee csenge = new Assignee("Csenge", "csenge@gmail.com");
//        Assignee hajni = new Assignee("Hajni", "hajni@gmail.com");
//        Assignee dori = new Assignee("Dóri", "dori@gmail.com");
//        Assignee viki = new Assignee("Viki", "viki@gmail.com");
//        Assignee johi = new Assignee("Johi", "johi@gmail.com");
//        Assignee eszter = new Assignee("Eszter", "eszter@gmail.com");
//
//        assigneeRepository.save(csenge);
//        assigneeRepository.save(hajni);
//        assigneeRepository.save(dori);
//        assigneeRepository.save(viki);
//        assigneeRepository.save(johi);
//        assigneeRepository.save(eszter);
//
//        todoRepository.save(new Todo("aaa", false, false, dori));
//        todoRepository.save(new Todo("bbb", true, false, csenge));
//        todoRepository.save(new Todo("ccc", true, true, hajni));
//        todoRepository.save(new Todo("ddd", true, false, dori));
//        todoRepository.save(new Todo("eee", true, true, viki));
//        todoRepository.save(new Todo("fff", true, true, johi));
//        todoRepository.save(new Todo("ggg", true, true, eszter));
//        todoRepository.save(new Todo("hhh", true, false, dori));
//        todoRepository.save(new Todo("iii", true, true, hajni));
//        todoRepository.save(new Todo("jjj", true, true, csenge));
//
//        System.out.println(assigneeRepository.findAll());

    }
}
