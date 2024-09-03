package com.yehorychev.spring.spring_selenium.windowtest;

import com.yehorychev.spring.spring_selenium.SpringBaseTestNGTest;
import com.yehorychev.spring.spring_selenium.kelvin.service.WindowSwitchService;
import com.yehorychev.spring.spring_selenium.pages.window.MainPage;
import com.yehorychev.spring.spring_selenium.pages.window.PageA;
import com.yehorychev.spring.spring_selenium.pages.window.PageB;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowSwitchTest  extends SpringBaseTestNGTest {

    @Autowired
    private MainPage mainPage;

    @Autowired
    private PageA pageA;

    @Autowired
    private PageB pageB;

    @Autowired
    private WindowSwitchService windowSwitchService;

    @BeforeClass
    public void setup() {
        this.mainPage.goTo();;
        this.mainPage.isLoaded();
        this.mainPage.launchAllWindows();
    }

    @Test
    public void switchTest() {
        this.windowSwitchService.switchByTitle("Page A");
        this.pageA.addToArea("hi page A");
        this.windowSwitchService.switchByIndex(2);
        this.pageA.addToArea("hello page B");
    }
}
