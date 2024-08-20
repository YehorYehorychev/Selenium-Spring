package com.yehorychev.spring.spring_selenium;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringSeleniumApplicationTests {

    @Test
    void contextLoads() {
        this.tv.playMovie();
    }
}
