package com.juliovillalvazo.springcoredemo.config;

import com.juliovillalvazo.util.Coach;
import com.juliovillalvazo.util.SwimmingCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("swimming")
    public Coach swimmingCoach() {
        return new SwimmingCoach();
    }
}
