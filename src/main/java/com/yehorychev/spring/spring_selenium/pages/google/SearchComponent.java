package com.yehorychev.spring.spring_selenium.pages.google;

import com.yehorychev.spring.spring_selenium.pages.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchComponent extends Base {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private List<WebElement> searchButtons;

    public void search(final String keyword) {
        this.searchBox.sendKeys(keyword);
        this.searchButtons
                .stream()
                .filter(e -> e.isDisplayed() && e.isEnabled())
                .findFirst()
                .ifPresent(WebElement::click);
    }

    @Override
    public boolean isLoaded() {
        return this.wait.until((d) -> this.searchBox.isDisplayed());
    }
}
