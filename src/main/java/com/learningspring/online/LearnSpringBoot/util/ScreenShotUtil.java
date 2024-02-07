package com.learningspring.online.LearnSpringBoot.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
@Component
public class ScreenShotUtil {

    @Autowired
    private ApplicationContext context;

/*    @Autowired
    private TakesScreenshot screenshotDriver;*/

    @Value("${screenshot.path}\\img.png")
    private Path path;

    public void takeScreenShot() throws IOException {
    //    File sourceFile = this.screenshotDriver.getScreenshotAs(OutputType.FILE);

        File sourceFile = context.getBean(TakesScreenshot.class).getScreenshotAs(OutputType.FILE);
        FileCopyUtils.copy(sourceFile,path.toFile());
    }
}
