package com.learningspring.online.LearnSpringBoot.udemy;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class LifeCyclePerformer {

    @Value("${Performer.name:SSW}")
    private String name;

    public LifeCyclePerformer(){

        System.out.println("Inside the constructor:"+ this.name);
    }
    @PostConstruct
    public void init(){
        System.out.println("Inside the constructor:"+ this.name);
        System.out.println("Instance of - "+this.getClass().getName()+" is set in motion");
    }

    public void startPerformance(){

        System.out.println("Performer have started");
        for (int i = 0; i < 10; i++) {
            System.out.println("Obeserve the performance: "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    @PreDestroy
    private void stopPerformer(){
        System.out.println("Performer is shut down");
    }
}
