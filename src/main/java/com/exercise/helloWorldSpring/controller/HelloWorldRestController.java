package com.exercise.helloWorldSpring.controller;

import com.exercise.helloWorldSpring.HelloWorldRest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class HelloWorldRestController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/helloworldrest")
    public HelloWorldRest helloWorldRest(@RequestParam(value = "nome", defaultValue = "World") String nome) {
        return new HelloWorldRest(counter.incrementAndGet(), String.format(template, nome));
    }
}
