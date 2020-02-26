package com.greenfoxacademy.programmerfoxclub;

import com.greenfoxacademy.programmerfoxclub.models.Food;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
    }

}
