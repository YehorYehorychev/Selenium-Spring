package com.yehorychev.spring.spring_selenium.stepdefinitions;

import com.yehorychev.spring.spring_selenium.kelvin.annotations.LazyAutowired;
import com.yehorychev.spring.spring_selenium.kelvin.service.ScreenshotService;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;

public class CucumberHooks {

    @LazyAutowired
    private ScreenshotService screenshotService;

    @AfterStep
    public void afterStep(Scenario scenario) {
        if (scenario.isFailed()) {

        }
    }

}
