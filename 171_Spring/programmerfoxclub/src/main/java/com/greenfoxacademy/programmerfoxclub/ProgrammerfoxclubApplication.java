package com.greenfoxacademy.programmerfoxclub;

import com.greenfoxacademy.programmerfoxclub.models.Food;
import com.greenfoxacademy.programmerfoxclub.services.FoxService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@SpringBootApplication
public class ProgrammerfoxclubApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProgrammerfoxclubApplication.class, args);


        //iteralas az enumban
//        for (Food food : Food.values()) {
//            System.out.println(food);
//        }

//        for (Food food : Food.values()) {
//            if (food.toString().toLowerCase().equals("pizza")) {
//                System.out.println(food.toString());
//            }
//        }

//        Date date = new Date( );
//        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MMMMMMMM dd. hh:mm:ss ");
//
//        System.out.println(ft.format(date));

        Date date = new Date( );
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MMMMMMMM dd. hh:mm:ss ");
        System.out.println((ft.format(date)).toString());
    }

}
