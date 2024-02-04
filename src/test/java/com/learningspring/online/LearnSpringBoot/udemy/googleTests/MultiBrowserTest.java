package com.learningspring.online.LearnSpringBoot.udemy.googleTests;

import com.learningspring.online.LearnSpringBoot.udemy.SpringBaseTestNGTests;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.testng.annotations.Test;

public class MultiBrowserTest extends SpringBaseTestNGTests {

    @Autowired
    private ApplicationContext context;
    @Test
    public void browserTest(){

        this.context.getBean("getChromeDriver", WebDriver.class).get("https://www.google.com/");
        this.context.getBean("getFireFoxDriver", WebDriver.class).get("https://www.bing.com/");

    }
}
