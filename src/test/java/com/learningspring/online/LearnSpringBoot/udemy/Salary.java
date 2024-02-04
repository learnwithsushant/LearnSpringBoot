package com.learningspring.online.LearnSpringBoot.udemy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Salary {



    private int amount;

    public Salary(){

    }

    public int getAmount() {
        return amount;
    }
    @Value("${amount:1500}")
    public void setAmount(int amount) {
        this.amount = amount;
    }


}
