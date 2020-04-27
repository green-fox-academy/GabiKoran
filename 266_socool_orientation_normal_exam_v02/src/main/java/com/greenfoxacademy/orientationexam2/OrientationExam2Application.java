package com.greenfoxacademy.orientationexam2;

import com.greenfoxacademy.orientationexam2.models.entities.ClassName;
import com.greenfoxacademy.orientationexam2.models.entities.Mentor;
import com.greenfoxacademy.orientationexam2.repositories.ClassNameRepository;
import com.greenfoxacademy.orientationexam2.repositories.MentorRepository;
import com.greenfoxacademy.orientationexam2.services.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication
public class OrientationExam2Application implements CommandLineRunner {

    private MentorRepository mentorRepository;
    private ClassNameRepository classNameRepository;
    private MentorService mentorService;

    @Autowired
    public OrientationExam2Application(MentorRepository mentorRepository, ClassNameRepository classNameRepository, MentorService mentorService) {
        this.mentorRepository = mentorRepository;
        this.classNameRepository = classNameRepository;
        this.mentorService =mentorService;
    }

    public static void main(String[] args) {
        SpringApplication.run(OrientationExam2Application.class, args);
    }

    @Override
    public void run(String... args) {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
//
//        ClassName tiptop = new ClassName("Tiptop");
//        classNameRepository.save(tiptop);
//        ClassName roboto = new ClassName("Roboto");
//        classNameRepository.save(roboto);
//        ClassName really = new ClassName("Really");
//        classNameRepository.save(really);
//        ClassName seadog = new ClassName("Seadog");
//        classNameRepository.save(seadog);
//
//        Mentor istvan = new Mentor("István");
//        istvan.setClassName(tiptop);
//        mentorRepository.save(istvan);
//        Mentor bence = new Mentor("Bence");
//        bence.setClassName(roboto);
//        mentorRepository.save(bence);
//        Mentor lujza = new Mentor("Lujza");
//        lujza.setClassName(really);
//        mentorRepository.save(lujza);
//        Mentor rozina = new Mentor("Rozina");
//        rozina.setClassName(really);
//        mentorRepository.save(rozina);
//        Mentor elena = new Mentor("Elena");
//        elena.setClassName(seadog);
//        mentorRepository.save(elena);
//        Mentor olga = new Mentor("Olga");
//        olga.setClassName(seadog);
//        mentorRepository.save(olga);
    }
}
