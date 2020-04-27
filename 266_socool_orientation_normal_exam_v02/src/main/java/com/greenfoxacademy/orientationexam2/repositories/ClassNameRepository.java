package com.greenfoxacademy.orientationexam2.repositories;

import com.greenfoxacademy.orientationexam2.models.entities.ClassName;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClassNameRepository extends CrudRepository<ClassName, Long> {

    List<ClassName> findAll();

    Optional<ClassName> findByName(String className);
}
