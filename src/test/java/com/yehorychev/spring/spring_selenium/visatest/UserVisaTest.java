package com.yehorychev.spring.spring_selenium.visatest;

import com.yehorychev.spring.spring_selenium.SpringBaseTestNGTest;
import com.yehorychev.spring.spring_selenium.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class UserVisaTest extends SpringBaseTestNGTest {

    @Autowired
    private CustomerRepository customerRepository;

    @Test
    public void visaTest() {
        this.customerRepository.findById(85)
                .ifPresent(user -> System.out.println(user.getFirstName()));
    }
}
