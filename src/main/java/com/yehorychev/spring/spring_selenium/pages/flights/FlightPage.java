package com.yehorychev.spring.spring_selenium.pages.flights;

import com.yehorychev.spring.spring_selenium.kelvin.annotations.Page;
import com.yehorychev.spring.spring_selenium.kelvin.annotations.TakeScreenshot;
import com.yehorychev.spring.spring_selenium.pages.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

@Page
public class FlightPage extends Base {

    @FindBy(css = "nav.P6Wwdb span")
    private List<WebElement> elements;

    public void goTo(final String url) {
        this.driver.get(url );
        this.driver.manage().window().maximize();
    }

    @TakeScreenshot
    public List<String> getLabels() {
        return this.elements
                .stream()
                .map(WebElement::getText)
                .map(String::trim)
                .collect(Collectors.toList());
    }

    @Override
    public boolean isLoaded() {
        return this.wait.until((d) -> !this.elements.isEmpty());
    }

    public void quitBrowser() {
        this.driver.quit();
    }
}
