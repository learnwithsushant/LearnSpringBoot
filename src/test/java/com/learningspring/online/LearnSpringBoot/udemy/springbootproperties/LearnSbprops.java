package com.learningspring.online.LearnSpringBoot.udemy.springbootproperties;

import com.learningspring.online.LearnSpringBoot.udemy.SpringBaseTestNGTests;
import org.openqa.selenium.devtools.v85.log.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

import java.io.IOException;

public class LearnSbprops extends SpringBaseTestNGTests {

    private static final Logger Log = LoggerFactory.getLogger(LearnSbprops.class);

    @Value("classpath:resources/application.properties")
    private Resource fileResource;

    @Value("https://www.bing.com/")
    private Resource urlResource;

    @Value("D:\\\\Learning\\\\SpringBoot")
    private Resource dirResource;

    @Test
    public void testProperties() throws IOException {
        Log.
        System.out.println("File Resource >> "+fileResource.getFilename());
        System.out.println("URL Resource >> "+urlResource.getURL());
        System.out.println("DIR Resource >> "+urlResource.getFilename());

    }


}
