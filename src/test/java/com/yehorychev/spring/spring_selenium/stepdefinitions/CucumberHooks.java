package com.yehorychev.spring.spring_selenium.stepdefinitions;

import com.yehorychev.spring.spring_selenium.kelvin.annotations.LazyAutowired;
import com.yehorychev.spring.spring_selenium.kelvin.service.ScreenshotService;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;

public class CucumberHooks {

    @LazyAutowired
    private ScreenshotService screenshotService;

    @LazyAutowired
    private WebDriver driver;

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.attach(this.screenshotService.getScreenshot(), "image/png", scenario.getName());
        }
    }

    @After
    public void afterScenario() {
        if (driver != null) {
            driver.quit();
        }
    }
}
