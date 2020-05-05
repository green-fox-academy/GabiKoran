package com.greenfoxacademy.orientationexam2.controllers;

import com.greenfoxacademy.orientationexam2.models.DTOs.MentorDTO;
import com.greenfoxacademy.orientationexam2.models.DTOs.NameDTO;
import com.greenfoxacademy.orientationexam2.models.entities.ClassName;
import com.greenfoxacademy.orientationexam2.models.entities.Mentor;
import com.greenfoxacademy.orientationexam2.services.ClassNameService;
import com.greenfoxacademy.orientationexam2.services.MentorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MentorRateRestController {

    private MentorService mentorService;
    private ClassNameService classNameService;

    public MentorRateRestController(MentorService mentorService, ClassNameService classNameService) {
        this.mentorService = mentorService;
        this.classNameService = classNameService;
    }

    @GetMapping("/api/mentors")
    public ResponseEntity listMentorsToClassName(@RequestParam(required = true) String className) {
        ClassName inputClass = classNameService.findClassByName(className);
        if (inputClass != null) {
            List<Mentor> mentors = inputClass.getMentors();
            if (mentors.size() != 0) {
                return ResponseEntity.status(200).body(classNameService.listMentorsNames(mentors));
            } else {
                return ResponseEntity.status(404).build();
            }
        } else {
            return ResponseEntity.status(400).build();
        }

    }

//    //ITT TARTOK, VALAMIÉRT HIBÁT DOB, HA
//    @PutMapping("/api/mentors/{mentorId}")
//    public ResponseEntity putMentorsData(@PathVariable Long mentorId, @RequestBody MentorDTO inputMentor) {
//        Optional<Mentor> mentorFromUrl = mentorService.findMentorById(mentorId);
//        if (mentorFromUrl.isPresent()) {
//            ClassName inputClassNameFromBody = classNameService.findClassByName(inputMentor.getClassName());
//            if (inputClassNameFromBody != null) {
//                System.out.println("van input ClassName");
//                Mentor mentor = mentorFromUrl.get();
//                mentor.setName(inputMentor.getName());
//                mentor.setClassName(inputClassNameFromBody);
//                mentorService.save(mentor);
//                return ResponseEntity.status(200).body(mentor);
//            } else {
//                return ResponseEntity.status(400).build();
//            }
//        } else {
//            return ResponseEntity.status(404).build();
//        }
//    }
}
