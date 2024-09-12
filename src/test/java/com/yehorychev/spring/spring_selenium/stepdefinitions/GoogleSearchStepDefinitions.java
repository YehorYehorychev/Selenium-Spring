package com.yehorychev.spring.spring_selenium.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchStepDefinitions {
    @Given("I am on the google page")
    public void iAmOnTheGooglePage() {
    }

    @When("I enter {string} as a keyword")
    public void iEnterAsAKeyword(String arg0) {
    }

    @And("I click on the search button")
    public void iClickOnTheSearchButton() {
    }

    @Then("I should see at least {string} results")
    public void iShouldSeeAtLeastResults(String arg0) {
    }
}
