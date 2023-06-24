package com.uningen.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // expose a "/" endpoint that returns "hello world"
    @GetMapping("/")
    public String sayHello(){
        return "Hello world!";
    }

    @GetMapping("/about")
    public String aboutPage(){
        return "<h1>This is a home page</h1>";
    }
}
