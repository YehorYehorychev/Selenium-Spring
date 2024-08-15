package com.yehorychev.spring.spring_selenium;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;

    public Address() {
        this.street = "2342 Boston st";
    }

    public String getStreet() {
        return street;
    }
}
