package com.yehorychev.spring.spring_selenium.googletest;

import com.yehorychev.spring.spring_selenium.SpringBaseTestNGTest;
import com.yehorychev.spring.spring_selenium.kelvin.annotations.LazyAutowired;
import com.yehorychev.spring.spring_selenium.pages.google.GooglePage;
import com.yehorychev.spring.spring_selenium.kelvin.service.ScreenshotService;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstGoogleTest extends SpringBaseTestNGTest {

    @LazyAutowired
    private GooglePage googlePage;

    @LazyAutowired
    private ScreenshotService screenshotService;

    @Test
    public void googleTest() {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isLoaded());

        this.googlePage.getSearchComponent().search("Spring Boot");
        Assert.assertTrue(this.googlePage.getSearchResult().isLoaded());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenshotService.takeScreenshot();
        this.googlePage.quitBrowser();
    }
}
