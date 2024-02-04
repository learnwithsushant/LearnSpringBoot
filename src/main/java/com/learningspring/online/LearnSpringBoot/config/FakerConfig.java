package com.learningspring.online.LearnSpringBoot.config;

import com.github.javafaker.Faker;
import com.learningspring.online.LearnSpringBoot.annotations.LazyConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class FakerConfig {
    @Bean
    public Faker getFaker(){
        return new Faker();
    }
}
