package com.yehorychev.spring.spring_selenium.pages.google;

import com.yehorychev.spring.spring_selenium.pages.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;

@Lazy
@Component
@Scope("prototype")
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
