package com.yehorychev.spring.spring_selenium.visatest;

import com.yehorychev.spring.spring_selenium.SpringBaseTestNGTest;
import com.yehorychev.spring.spring_selenium.entity.Customer;
import com.yehorychev.spring.spring_selenium.pages.visa.VisaRegistrationPage;
import com.yehorychev.spring.spring_selenium.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

import java.util.List;

public class UserVisaTest extends SpringBaseTestNGTest {

    @Autowired
    private VisaRegistrationPage registrationPage;

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void visaTest() {
        List<Customer> customers = this.customerRepository.findAll()
                .stream()
                .limit(3)
                .toList();
        for (Customer c : customers) {
            this.registrationPage.goTo();
            this.registrationPage.setNames(c.getFirstName(), c.getLastName());
            this.registrationPage.setCountryFromAndTo(c.getFromCountry(), c.getToCountry());
            this.registrationPage.setBirthDate(c.getDob().toLocalDate());
            this.registrationPage.setContactDetails(c.getEmail(), c.getPhone());
            this.registrationPage.setComments(c.getComments());
            this.registrationPage.submit();

            System.out.println(this.registrationPage.getConfirmationNumber());
        }
    }
}
