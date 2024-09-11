package com.yehorychev.spring.spring_selenium.visatest;

import com.yehorychev.spring.spring_selenium.SpringBaseTestNGTest;
import com.yehorychev.spring.spring_selenium.entity.Customer;
import com.yehorychev.spring.spring_selenium.pages.visa.VisaRegistrationPage;
import com.yehorychev.spring.spring_selenium.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.sql.Date;

public class UserVisaTest extends SpringBaseTestNGTest {

    private static final Logger logger = LoggerFactory.getLogger(UserVisaTest.class);

    @Autowired
    private VisaRegistrationPage registrationPage;

    @Autowired
    private CustomerRepository customerRepository;

    @Test(dataProvider = "getData")
    public void visaTest(Customer customer) {
        this.registrationPage.goTo();
        this.registrationPage.setNames(customer.getFirstName(), customer.getLastName());
        this.registrationPage.setCountryFromAndTo(customer.getFromCountry(), customer.getToCountry());
        this.registrationPage.setBirthDate(customer.getDob().toLocalDate());
        this.registrationPage.setContactDetails(customer.getEmail(), customer.getPhone());
        this.registrationPage.setComments(customer.getComments());
        this.registrationPage.submit();
        this.registrationPage.quitBrowser();

        logger.info("Request confirmation number: " + this.registrationPage.getConfirmationNumber());
        System.out.println(this.registrationPage.getConfirmationNumber());
    }

    @DataProvider
    public Object[] getData(ITestContext context) {
        return this.customerRepository
                .findByDobBetween(
                        Date.valueOf(context.getCurrentXmlTest().getParameter("dobFrom")),
                        Date.valueOf(context.getCurrentXmlTest().getParameter("dobTo")))
                .stream()
                .limit(3)
                .toArray();
    }
}
