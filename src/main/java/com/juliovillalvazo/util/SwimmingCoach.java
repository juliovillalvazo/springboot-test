package com.juliovillalvazo.util;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

public class SwimmingCoach implements Coach {
    @PostConstruct
    public void check() {
        System.out.println("SwimmingCoach: inside method check: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Swimm 1000 meters as a warm up!!";
    }
}
