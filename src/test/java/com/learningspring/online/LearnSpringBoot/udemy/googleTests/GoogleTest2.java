package com.learningspring.online.LearnSpringBoot.udemy.googleTests;

import com.learningspring.online.LearnSpringBoot.page.google.GooglePage;
import com.learningspring.online.LearnSpringBoot.udemy.SpringBaseTestNGTests;
import com.learningspring.online.LearnSpringBoot.util.ScreenShotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleTest2 extends SpringBaseTestNGTests {

    @Autowired
    private GooglePage googlePage;

@Lazy
    @Autowired
    ScreenShotUtil screenShotUtil;


    @Test
    public void googleTests() throws IOException {

        googlePage.goTo();
        Assert.assertTrue(googlePage.isLoaded());

        googlePage.getSearchComponent().search("LinkedIn courses");
        Assert.assertTrue(googlePage.getSearchResult().isLoaded());
        Assert.assertTrue(googlePage.getSearchResult().getResultCount() > 2);
        // googlePage.getSearchComponent().takeScreenShot();
        screenShotUtil.takeScreenShot();
        googlePage.close();


    }
}
