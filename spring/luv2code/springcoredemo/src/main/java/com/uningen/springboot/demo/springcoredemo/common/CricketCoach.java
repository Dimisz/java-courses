package com.uningen.springboot.demo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component // marks the class as a spring bean
// and makes it eligible for dependency injection
public class CricketCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice fast crawling for 15 minutes.";
    }
}
