package com.uningen.springboot.demo.mycoolapp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // injecting properties for coach.name and team.name
    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;
    @GetMapping("/")
    public String sayHello(){
        return "Hello world! How are you?";
    }
    @GetMapping("/bye")
    public String sayBye() {
        return "Good bye!!!!";
    }

    @GetMapping("/team/coach")
    public String getCoachName(){
        return "Coach name is: " + this.coachName;
    }

    @GetMapping("/team/name")
    public String getTeamName(){
        return "The team name is " + this.teamName;
    }

    @GetMapping("/workin")
    public String dailyWorkout(){
        return "Run a hard 5k";
    }
}
