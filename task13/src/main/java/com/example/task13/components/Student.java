package com.example.task13.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Student {
    @Value("${student.name}")
    private String name;
    @Value("${student.lastname}")
    private String lastname;
    @Value("${student.group}")
    private String group;

    @PostConstruct
    public void printStudent() {
        System.out.println(name + " " + lastname + " " + group);
    }
}
