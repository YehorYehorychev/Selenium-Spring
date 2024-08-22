package com.yehorychev.spring.spring_selenium.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.util.Date;

@Lazy
@Component
public class ScreenshotUtil {

    @Autowired
    private TakesScreenshot driver;

    @Value("${screenshot.path}")
    private Path path;

    public void takeScreenshot() {
        File sourceFile = this.driver.getScreenshotAs(OutputType.FILE);
        try {
            File screenshotDirectory = this.path.toFile();
            if (!screenshotDirectory.exists()) {
                screenshotDirectory.mkdirs();
            }
            String timestamp = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
            String uniqueImgName = "screenshot_" + timestamp.replace(":", "-")
                    .replace("/", "-") + ".png";
            FileCopyUtils.copy(sourceFile, this.path.resolve(uniqueImgName).toFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
