package com.example.springbootazureapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class SpringBootAzureApiApplication {

    @GetMapping("/test")
    public List<String> message() {
        List<String> students = new ArrayList<>();
        students.add("Victor");
        students.add("Mateus");

        return students;
    }
    public static void main(String[] args) {
        SpringApplication.run(SpringBootAzureApiApplication.class, args);
    }

}
