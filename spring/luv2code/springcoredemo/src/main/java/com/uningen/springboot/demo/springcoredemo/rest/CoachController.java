package com.uningen.springboot.demo.springcoredemo.rest;

import com.uningen.springboot.demo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    // private field for the dependency
    private Coach myCoach;

    // constructor for DI
    // recommended way, commented out to showcase SETTER INJECTION
//    @Autowired
//    public CoachController(Coach coach){
//        myCoach = coach;
//    }
    @Autowired
    public void setCoach(Coach theCoach){
        myCoach = theCoach;
    }
    @GetMapping("/daily-workout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
