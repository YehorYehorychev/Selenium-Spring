package com.yehorychev.spring.spring_selenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.yehorychev.spring.spring_selenium.stepdefinitions",
        plugin = {
                "pretty",
                "html:test-output/reports/cucumber-report.html"
        },
        monochrome = true
)
public class CucumberRunner extends AbstractTestNGCucumberTests {
}
