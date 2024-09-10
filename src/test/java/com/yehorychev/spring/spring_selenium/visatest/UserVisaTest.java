package com.yehorychev.spring.spring_selenium.visatest;

import com.yehorychev.spring.spring_selenium.SpringBaseTestNGTest;
import com.yehorychev.spring.spring_selenium.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class UserVisaTest extends SpringBaseTestNGTest {

    @Autowired
    private CustomerRepository customerRepository;

}
