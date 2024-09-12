package com.yehorychev.spring.spring_selenium.stepdefinitions;

import com.yehorychev.spring.spring_selenium.kelvin.annotations.LazyAutowired;
import com.yehorychev.spring.spring_selenium.pages.visa.VisaRegistrationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.util.StringUtils;
import org.testng.Assert;

import java.time.LocalDate;

public class VisaStepDefinitions {

    @LazyAutowired
    private VisaRegistrationPage registrationPage;

    @Given("I am on VISA registration form")
    public void launchWebSite() {
        this.registrationPage.goTo();
        Assert.assertTrue(this.registrationPage.isLoaded());
    }

    @When("I select my from country {string} and to country {string}")
    public void selectCountry(String from, String to) {
        this.registrationPage.setCountryFromAndTo(from, to);
    }

    @And("I enter my dob as {string}")
    public void enterDob(String dob) {
        this.registrationPage.setBirthDate(LocalDate.parse(dob));
    }

    @And("I enter my name as {string} and {string}")
    public void enterNames(String firstName, String lastName) {
        this.registrationPage.setNames(firstName, lastName);
    }

    @And("I enter my contact details as {string} and {string}")
    public void enterContactDetails(String email, String phone) {
        this.registrationPage.setContactDetails(email, phone);
    }

    @And("I enter the comment {string}")
    public void enterComment(String comment) {
        this.registrationPage.setComments(comment);
    }

    @And("I submit the form")
    public void submitTheForm() {
        this.registrationPage.submit();
    }

    @Then("I should see get the confirmation number")
    public void verifyConfirmationNumber() {
        boolean isNotEmpty = StringUtils.hasText(this.registrationPage.getConfirmationNumber().trim());
        Assert.assertTrue(isNotEmpty);
    }
}
