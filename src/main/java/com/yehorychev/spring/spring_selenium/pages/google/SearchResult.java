package com.yehorychev.spring.spring_selenium.pages.google;

import com.yehorychev.spring.spring_selenium.pages.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchResult extends Base {

    @FindBy(css = "div.g")
    private List<WebElement> results;

    public int getCount() {
        return this.results.size();
    }

    @Override
    public boolean isLoaded() {
        return this.wait.until((d) -> !this.results.isEmpty());
    }
}
