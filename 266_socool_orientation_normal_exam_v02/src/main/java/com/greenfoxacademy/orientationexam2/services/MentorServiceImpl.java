package com.greenfoxacademy.orientationexam2.services;

import com.greenfoxacademy.orientationexam2.models.DTOs.MentorDTO;
import com.greenfoxacademy.orientationexam2.models.entities.ClassName;
import com.greenfoxacademy.orientationexam2.models.entities.Mentor;
import com.greenfoxacademy.orientationexam2.repositories.ClassNameRepository;
import com.greenfoxacademy.orientationexam2.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MentorServiceImpl implements MentorService {

    private MentorRepository mentorRepository;
    private ClassNameRepository classNameRepository;

    @Autowired
    public MentorServiceImpl(MentorRepository mentorRepository, ClassNameRepository classNameRepository) {
        this.mentorRepository = mentorRepository;
        this.classNameRepository = classNameRepository;
    }

    @Override
    public List<Mentor> listMentors() {
        return mentorRepository.findAllBy();
    }

    @Override
    public boolean isNameAlreadyTaken(String name) {
        return mentorRepository.findByName(name).isPresent();
    }

    @Override
    public Optional<Mentor> findMentorByName(String name) {
        return mentorRepository.findByName(name);
    }

    @Override
    public void save(String name) {
        mentorRepository.save(new Mentor(name));
    }

    @Override
    public void save(Mentor mentor) {
        mentorRepository.save(mentor);
    }

    @Override
    public Optional<Mentor> findMentorById(Long id) {
        return mentorRepository.findById(id);
    }

    @Override
    public Long saveNewMentorWithClassNameAndGetItsId(MentorDTO mentor) {
        Mentor newMentor = new Mentor(mentor.getName());
        ClassName inputClassName = classNameRepository.findByName(mentor.getClassName()).get();
        newMentor.setClassName(inputClassName);
        save(newMentor);
        return newMentor.getId();
    }
}
