package ru.sorokin.springcourse;

import org.springframework.stereotype.Component;


public class ClassicalMusic implements Music {

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}

