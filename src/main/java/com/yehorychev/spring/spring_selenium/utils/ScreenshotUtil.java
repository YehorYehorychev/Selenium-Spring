package com.yehorychev.spring.spring_selenium.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Component
public class ScreenshotUtil {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}/img.png")
    private Path path;

    public void takeScreenshot() {
        File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);
        try {
            File screenshotDirectory = this.path.getParent().toFile();
            if (!screenshotDirectory.exists()) {
                screenshotDirectory.mkdirs();
            }
            FileCopyUtils.copy(sourceFile, this.path.toFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
