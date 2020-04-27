package com.greenfoxacademy.orientationexam2.services;

import com.greenfoxacademy.orientationexam2.models.DTOs.MentorDTO;
import com.greenfoxacademy.orientationexam2.models.entities.Mentor;

import java.util.List;
import java.util.Optional;

public interface MentorService {

    List<Mentor> listMentors();

    boolean isNameAlreadyTaken(String name);

    Optional<Mentor> findMentorByName(String name);

    void save(String name);

    void save(Mentor mentor);

    Optional<Mentor> findMentorById(Long id);

    Long saveNewMentorWithClassNameAndGetItsId(MentorDTO mentor);
}
