package com.greenfoxacademy.todo.services;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import com.greenfoxacademy.todo.repositories.AssigneeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssigneeService {

    private AssigneeRepository assigneeRepository;

    @Autowired
    public AssigneeService(AssigneeRepository assigneeRepository) {
        this.assigneeRepository = assigneeRepository;
    }

    public Iterable<Assignee> findAll() {
        return assigneeRepository.findAll();
    }

    public void add(String name, String email) {
        assigneeRepository.save(new Assignee(name, email));
    }

    public void edit(Assignee assignee) {
        assigneeRepository.save(assignee);
    }

    public void deleteById(Long id) {
        assigneeRepository.deleteById(id);
    }

    public Assignee findAssigneeById(Long id) {
        Optional<Assignee> findOneById = assigneeRepository.findById(id);
        if (findOneById.isPresent()) {
            return findOneById.get();
        }
        return null;
        //return findOneById.orElse(null);
    }

    public Optional<Assignee> getAssigneeByName(String name) {
        return assigneeRepository.findByName(name);
    }
}
