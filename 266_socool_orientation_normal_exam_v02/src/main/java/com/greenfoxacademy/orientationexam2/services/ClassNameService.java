package com.greenfoxacademy.orientationexam2.services;

import com.greenfoxacademy.orientationexam2.models.DTOs.NameDTO;
import com.greenfoxacademy.orientationexam2.models.entities.ClassName;
import com.greenfoxacademy.orientationexam2.models.entities.Mentor;

import java.util.List;

public interface ClassNameService {
    List<ClassName> listClassNames();

    ClassName findClassByName(String className);

    List<NameDTO> listMentorsNames(List<Mentor> mentors);
}
