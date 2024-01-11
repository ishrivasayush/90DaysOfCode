package com.narainox.springBoot_docker_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyWebController {
    @GetMapping("/home")
    public String sayHello()
    {
        return "This is Hello Ayush!";
    }
}
