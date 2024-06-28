package com.juliovillalvazo.springcoredemo.rest;

import com.juliovillalvazo.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    private Coach myCoach;
    private Coach swimCoach;

    @Autowired
    public DemoController(
            @Qualifier("baseballCoach") Coach theCoach, @Qualifier("swimming") Coach theSwimCoach) {
        myCoach = theCoach;
        swimCoach = theSwimCoach;
    }

    @GetMapping("/daily-workout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
