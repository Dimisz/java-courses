package com.uningen.springboot.demo.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component // marks the class as a spring bean
// and makes it eligible for dependency injection
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor: " + getClass().getSimpleName());
    }
    
    @Override
    public String getDailyWorkout() {
        return "Cricket practice for 30 minutes.";
    }


}
