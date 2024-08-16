package com.yehorychev.spring.spring_selenium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

    @Value("${street}")
    private String street;


    public String getStreet() {
        return street;
    }
}
