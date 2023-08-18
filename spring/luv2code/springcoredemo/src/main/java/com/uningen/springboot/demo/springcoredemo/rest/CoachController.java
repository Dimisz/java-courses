package com.uningen.springboot.demo.springcoredemo.rest;

import com.uningen.springboot.demo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    // private field for the dependency
    private Coach myCoach;
//    private Coach anotherCoach;
    // constructor for DI
    // recommended way, commented out to showcase SETTER INJECTION
    @Autowired
    public CoachController(
            @Qualifier("cricketCoach") Coach coach
//            @Qualifier("soccerCoach") Coach secondCoach
    ){
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = coach;
//        anotherCoach = secondCoach;
    }
//    @Autowired
//    public void setCoach(Coach theCoach){
//        myCoach = theCoach;
//    }
    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

//    @GetMapping("/alternative-workout")
//    public String getAlternativeWorkout(){
//        return anotherCoach.getDailyWorkout();
//    }
//
//    @GetMapping("/check")
//    public String check(){
//        return "Comparing myCoach == anotherCoach, " + (myCoach == anotherCoach);
//    }
}
