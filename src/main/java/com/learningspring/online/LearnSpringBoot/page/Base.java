package com.learningspring.online.LearnSpringBoot.page;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

public abstract class Base {

    @Autowired
    protected WebDriver driver;

    @Autowired
    public WebDriverWait wait;


    @PostConstruct
    private void init(){
        PageFactory.initElements(this.driver,this);
    }

    public abstract boolean isLoaded();

    @Value("${screenshot.path}/img.png")
    private Path path;

/*
    public void takeScreenShot() throws IOException {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File sourceFile =  screenshot.getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile,path.toFile());
    }
*/


}
