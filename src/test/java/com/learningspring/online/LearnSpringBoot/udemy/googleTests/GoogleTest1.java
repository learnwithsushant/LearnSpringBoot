package com.learningspring.online.LearnSpringBoot.udemy.googleTests;

import com.learningspring.online.LearnSpringBoot.util.ScreenShotUtil;
import com.learningspring.online.LearnSpringBoot.page.google.GooglePage;
import com.learningspring.online.LearnSpringBoot.udemy.SpringBaseTestNGTests;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleTest1 extends SpringBaseTestNGTests {
    @Autowired
    private GooglePage googlePage;


/*@Autowired
ScreenShotUtil screenShotUtil;*/


    @Test
    public void googleTests() throws IOException {

        googlePage.goTo();
        Assert.assertTrue(googlePage.isLoaded());

        googlePage.getSearchComponent().search("pluralsight courses");
        Assert.assertTrue(googlePage.getSearchResult().isLoaded());
        Assert.assertTrue(googlePage.getSearchResult().getResultCount() > 2);
       // googlePage.getSearchComponent().takeScreenShot();
      //  screenShotUtil.takeScreenShot();
        googlePage.close();


    }
}
