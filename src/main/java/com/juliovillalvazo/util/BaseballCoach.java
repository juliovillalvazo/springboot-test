package com.juliovillalvazo.util;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class BaseballCoach implements Coach {
    @PostConstruct
    public void startupSetup() {
        System.out.println("BaseballCoach: inside method startupSetup: " + getClass().getName());
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("BaseballCoach: inside method cleanup: " + getClass().getName());
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice";
    }
}
