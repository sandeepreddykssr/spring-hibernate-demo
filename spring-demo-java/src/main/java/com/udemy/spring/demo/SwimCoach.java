package com.udemy.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class SwimCoach implements Coach {

    @Qualifier("sadFortuneService")
    @Autowired
    FortuneService fortuneService;

    @Override
    public String getDailyWorkout() {
        return "Swim";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}










