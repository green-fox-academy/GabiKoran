package com.greenfoxacademy.todo.repositories;

import com.greenfoxacademy.todo.models.Assignee;
import com.greenfoxacademy.todo.models.Todo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository <Todo, Long> {

    Iterable<Todo> findAllByIsDone(boolean isDone);

    Iterable<Todo> findAllByTitleContains(String inputText);

    Iterable<Todo> findAllByAssignee(Assignee assignee);

}
