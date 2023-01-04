package com.example.springbootazureapi.repository;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Repository
public class Repository {

    public List<String> getAllStudents() {
        List<String> students = new ArrayList<>();
        students.add("Victor");
        students.add("Mateus");

        return students;
    }
}
