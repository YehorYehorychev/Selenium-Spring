package com.yehorychev.spring.spring_selenium.scope;

import com.yehorychev.spring.spring_selenium.SpringBaseTestNGTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.Test;

public class JuniorSeniorTest extends SpringBaseTestNGTest {

    @Autowired
    private JuniorEngineer juniorEngineer;

    @Autowired
    private SeniorEngineer seniorEngineer;

    @Test
    public void scopeTest() {
        this.juniorEngineer.setAmount(100);
        System.out.println("Junior: " + this.juniorEngineer.getSalary().getAmount());
        this.seniorEngineer.setAmount(500);
        System.out.println("Senior: " + this.seniorEngineer.getSalary().getAmount());

        System.out.println("Junior: " + this.juniorEngineer.getSalary().getAmount());
    }
}
