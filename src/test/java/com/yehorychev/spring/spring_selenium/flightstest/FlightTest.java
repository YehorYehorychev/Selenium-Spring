package com.yehorychev.spring.spring_selenium.flightstest;

import com.yehorychev.spring.spring_selenium.SpringBaseTestNGTest;
import com.yehorychev.spring.spring_selenium.pages.flights.FlightPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlightTest extends SpringBaseTestNGTest {

    @Autowired
    private FlightPage flightPage;

    @Autowired
    private FlightAppDetails appDetails;

    @Test
    public void flightTest() {
        this.flightPage.goTo(this.appDetails.getUrl());
        Assert.assertTrue(this.flightPage.isLoaded());

        Assert.assertEquals(this.flightPage.getLabels(), this.appDetails.getLabels());
        this.flightPage.quitBrowser();
    }
}
