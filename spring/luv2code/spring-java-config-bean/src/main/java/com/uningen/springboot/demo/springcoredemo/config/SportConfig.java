package com.uningen.springboot.demo.springcoredemo.config;

import com.uningen.springboot.demo.springcoredemo.common.Coach;
import com.uningen.springboot.demo.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aquatic") // implicit bean-id
    public Coach swimCoach() {
        //by default (if not provided in the annotation)
        // swimCoach here is a bean-id (defaults to lower-cased class name)
        return new SwimCoach();
    }
}
