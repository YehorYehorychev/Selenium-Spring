package com.yehorychev.spring.spring_selenium;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {

    @Autowired
    private Television tv;

    @Test
    void contextLoads() {
        this.tv.playMovie();
    }
}
