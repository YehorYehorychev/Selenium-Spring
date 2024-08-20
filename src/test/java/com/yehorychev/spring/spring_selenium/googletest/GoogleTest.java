package com.yehorychev.spring.spring_selenium.googletest;

import com.yehorychev.spring.spring_selenium.SpringBaseTestNGTest;
import com.yehorychev.spring.spring_selenium.pages.google.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends SpringBaseTestNGTest {

    @Autowired
    private GooglePage googlePage;

    @Test
    public void googleTest() {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isLoaded());

        this.googlePage.getSearchComponent().search("Spring Boot");
        Assert.assertTrue(this.googlePage.getSearchResult().isLoaded());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
    }
}
