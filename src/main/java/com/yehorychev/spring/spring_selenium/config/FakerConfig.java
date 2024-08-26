package com.yehorychev.spring.spring_selenium.config;

import com.github.javafaker.Faker;
import com.yehorychev.spring.spring_selenium.annotations.LazyConfiguration;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class FakerConfig {

    @Bean
    public Faker getFaker() {
        return new Faker();
    }
}
