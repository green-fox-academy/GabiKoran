package com.greenfoxacademy.orientationexam2.repositories;

import com.greenfoxacademy.orientationexam2.models.entities.Mentor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MentorRepository extends CrudRepository<Mentor, Long> {

    List<Mentor> findAllBy();

    Optional<Mentor> findByName(String name);
}
