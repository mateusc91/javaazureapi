package com.example.springbootazureapi.controller;

import com.example.springbootazureapi.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    private Repository repository;

    @GetMapping("/students")
    public List<String> message() {
        return repository.getAllStudents();
    }
}
