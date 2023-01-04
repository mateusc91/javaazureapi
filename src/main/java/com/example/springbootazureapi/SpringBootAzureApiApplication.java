package com.example.springbootazureapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringBootAzureApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAzureApiApplication.class, args);
    }

}
