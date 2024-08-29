package com.yehorychev.spring.spring_selenium.kelvin.config;

import com.yehorychev.spring.spring_selenium.kelvin.annotations.LazyConfiguration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import java.time.Duration;

@LazyConfiguration
public class WebDriverWaitConfig {

    @Value("${default.timeout}")
    private int timeout;

    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public WebDriverWait webDriverWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(this.timeout));
    }
}
