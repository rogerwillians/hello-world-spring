package com.exercise.helloWorldSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/helloworld")
    public String hello() {
        return "helloworld"; //nome do arquivo html thymeleaf
    }
}
