package com.uningen.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    // injecting properties for coach.name and team.name

    @GetMapping("/")
    public String sayHello(){
        return "Hello world! How are you?";
    }
    @GetMapping("/bye")
    public String sayBye() {
        return "Good bye!!!!";
    }

    @GetMapping("/work-out")
    public String dailyWorkout(){
        return "Run a hard 5k";
    }
}
