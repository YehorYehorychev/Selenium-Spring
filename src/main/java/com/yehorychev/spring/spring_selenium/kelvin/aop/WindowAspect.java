package com.yehorychev.spring.spring_selenium.kelvin.aop;

import com.yehorychev.spring.spring_selenium.kelvin.annotations.Window;
import com.yehorychev.spring.spring_selenium.kelvin.service.WindowSwitchService;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WindowAspect {

    @Autowired
    private WindowSwitchService windowSwitchService;

    @Before("@target(window) && within(com.yehorychev.spring.spring_selenium..*)")
    public void before(Window window) {
        this.windowSwitchService.switchByTitle(window.value());
    }

    @After("@target(window) && within(com.yehorychev.spring.spring_selenium..*)")
    public void after(Window window) {
        this.windowSwitchService.switchByIndex(0);
    }
}
