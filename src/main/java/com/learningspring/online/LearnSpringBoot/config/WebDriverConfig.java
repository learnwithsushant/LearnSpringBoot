package com.learningspring.online.LearnSpringBoot.config;

import com.learningspring.online.LearnSpringBoot.annotations.LazyConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

import java.time.Duration;
@LazyConfiguration
public class WebDriverConfig {

    @Bean
    @ConditionalOnProperty(name="browser",havingValue = "chrome")
    public WebDriver getChromeDriver(){
        WebDriverManager.chromedriver().driverVersion("121.0.6167.85").setup();
        return new ChromeDriver();
    }

    @Bean
    @ConditionalOnProperty(name="browser",havingValue = "firefox")
    public WebDriver getFireFoxDriver(){
        WebDriverManager.firefoxdriver().driverVersion("122.0").setup();
        return new FirefoxDriver();
    }

}
