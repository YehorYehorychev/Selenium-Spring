package com.yehorychev.spring.spring_selenium.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDefinitions {
    @Given("I am on the google page")
    public void launchWebSite() {

    }

    @When("I enter {string} as a keyword")
    public void enterKeyword(String keyword) {

    }

    @And("I click on the search button")
    public void clickSearch() {

    }

    @Then("I should see at least {int} results")
    public void verifyResults(int count) {

    }
}
