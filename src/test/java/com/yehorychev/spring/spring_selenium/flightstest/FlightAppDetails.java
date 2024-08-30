package com.yehorychev.spring.spring_selenium.flightstest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@PropertySource("language/fr.properties")
public class FlightAppDetails {

    @Value("${flight.app.url}")
    private String url;

    @Value("${flight.app.labels}")
    private List<String> labels;

    public String getUrl() {
        return url;
    }

    public List<String> getLabels() {
        return labels;
    }
}
