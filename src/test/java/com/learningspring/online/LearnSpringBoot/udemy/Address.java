package com.learningspring.online.LearnSpringBoot.udemy;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${street:1 Tilak marg}")
    private String street;

    public Address() {
        this.street = street;
    }

    @Autowired
    private Faker faker;

    public Address(String street) {
        this.street = street;
    }

    public String getStreet() {
        return faker.address().streetAddress();
    }


}
