package com.yehorychev.spring.spring_selenium.googletest;

import com.yehorychev.spring.spring_selenium.SpringBaseTestNGTest;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.testng.annotations.Test;

public class MultiBrowserTest extends SpringBaseTestNGTest {

    @Autowired
    private ApplicationContext ctx;

    @Test
    public void browserTest() {
        this.ctx.getBean("chromeDriver", WebDriver.class).get("https://google.com");
        this.ctx.getBean("firefoxDriver", WebDriver.class).get("https://yahoo.com");
    }
}
