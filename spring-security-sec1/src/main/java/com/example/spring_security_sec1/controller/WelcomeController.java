package com.example.spring_security_sec1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    @GetMapping("/welcome")
    public String sayWelcome(){

        return "Welcome to Eazy Bank! You are using the application " +
                "with Spring Security!";
    }
}
