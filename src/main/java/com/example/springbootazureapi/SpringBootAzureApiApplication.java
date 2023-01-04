package com.example.springbootazureapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAzureApiApplication {

    @GetMapping("/message")
    public String message() {
        return "App deployed!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAzureApiApplication.class, args);
    }

}
