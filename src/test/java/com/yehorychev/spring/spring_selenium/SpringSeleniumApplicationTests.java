package com.yehorychev.spring.spring_selenium;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {

    @Autowired
    private User user;

    @Autowired
    private Faker faker;

    @Test
    void contextLoads() {
        System.out.println(faker.name().firstName());
    }
}
