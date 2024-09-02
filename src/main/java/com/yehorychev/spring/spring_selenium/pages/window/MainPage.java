package com.yehorychev.spring.spring_selenium.pages.window;

import com.yehorychev.spring.spring_selenium.kelvin.annotations.Page;
import com.yehorychev.spring.spring_selenium.pages.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

@Page
public class MainPage extends Base {

    @FindBy(tagName = "a")
    private List<WebElement> links;


    @Override
    public boolean isLoaded() {
        return false;
    }
}
