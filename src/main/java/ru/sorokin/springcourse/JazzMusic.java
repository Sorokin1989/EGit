package ru.sorokin.springcourse;

import org.springframework.stereotype.Component;


public class JazzMusic implements Music {
    @Override
    public String getSong() {
        return "Music for the Soul";
    }
}
