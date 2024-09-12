package com.yehorychev.spring.spring_selenium;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "classpath:features",
        glue = "com.yehorychev.spring.spring_selenium.stepdefinitions",
        tags = "@Regression",
        plugin = {
                "pretty",
                "html:test-output/reports/cucumber-report.html"
        },
        monochrome = true
)
public class CucumberRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios() {
        return super.scenarios();
    }
}
