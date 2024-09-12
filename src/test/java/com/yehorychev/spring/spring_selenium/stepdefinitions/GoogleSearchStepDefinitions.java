package com.yehorychev.spring.spring_selenium.stepdefinitions;

import com.yehorychev.spring.spring_selenium.kelvin.annotations.LazyAutowired;
import com.yehorychev.spring.spring_selenium.pages.google.GooglePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.context.SpringBootTest;
import org.testng.Assert;

@SpringBootTest
public class GoogleSearchStepDefinitions {

    @LazyAutowired
    private GooglePage googlePage;

    @Given("I am on the google page")
    public void launchWebSite() {
        this.googlePage.goTo();
    }

    @When("I enter {string} as a keyword")
    public void enterKeyword(String keyword) {
        this.googlePage.getSearchComponent().search(keyword);
    }

    @Then("I should see search results page")
    public void clickSearch() {
        Assert.assertTrue(this.googlePage.getSearchResult().isLoaded());
    }

    @Then("I should see at least {int} results")
    public void verifyResults(int count) {
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() >= count);
    }
}
