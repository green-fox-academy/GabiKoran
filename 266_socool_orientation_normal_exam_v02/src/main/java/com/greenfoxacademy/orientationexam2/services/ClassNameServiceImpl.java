package com.greenfoxacademy.orientationexam2.services;

import com.greenfoxacademy.orientationexam2.models.DTOs.NameDTO;
import com.greenfoxacademy.orientationexam2.models.entities.ClassName;
import com.greenfoxacademy.orientationexam2.models.entities.Mentor;
import com.greenfoxacademy.orientationexam2.repositories.ClassNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ClassNameServiceImpl implements ClassNameService {

    private ClassNameRepository classNameRepository;

    @Autowired
    public ClassNameServiceImpl(ClassNameRepository classNameRepository) {
        this.classNameRepository = classNameRepository;
    }

    @Override
    public List<ClassName> listClassNames() {
        return classNameRepository.findAll();
    }

    @Override
    public ClassName findClassByName(String className) {
        Optional<ClassName> inputClassNameOptional = classNameRepository.findByName(className);
        if (inputClassNameOptional.isPresent()) {
            return inputClassNameOptional.get();
        } else {
            return null;
        }
    }

    @Override
    public List<NameDTO> listMentorsNames(List<Mentor> mentors) {
        List<NameDTO> names = new ArrayList<>();
        for (int i = 0; i < mentors.size(); i++) {
            names.add(new NameDTO(mentors.get(i).getName()));
        }
        return names;
    }
}
