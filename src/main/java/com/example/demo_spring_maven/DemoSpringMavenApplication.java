package com.example.demo_spring_maven;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoSpringMavenApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSpringMavenApplication.class, args);
    }

    @GetMapping("/hi")
    public String sayHello() {
        return "HI";
    }
}
