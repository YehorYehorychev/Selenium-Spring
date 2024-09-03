package com.yehorychev.spring.spring_selenium.pages.window;

import com.yehorychev.spring.spring_selenium.kelvin.annotations.Window;
import com.yehorychev.spring.spring_selenium.pages.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@Window("Page C")
public class PageC extends Base {

    @FindBy(id = "area")
    private WebElement textArea;

    public void addToArea(final String message) {
        this.textArea.sendKeys(message);
    }

    @Override
    public boolean isLoaded() {
        return this.wait.until((d) -> this.textArea.isDisplayed());
    }
}
