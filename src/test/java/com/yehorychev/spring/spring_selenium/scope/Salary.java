package com.yehorychev.spring.spring_selenium.scope;

import org.springframework.stereotype.Component;

@Component
public class Salary {

    private int Amount;

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }
}
