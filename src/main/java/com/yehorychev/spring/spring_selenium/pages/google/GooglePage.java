package com.yehorychev.spring.spring_selenium.pages.google;

import com.yehorychev.spring.spring_selenium.pages.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends Base {

   @Autowired
   private SearchComponent searchComponent;

   @Autowired
   private SearchResult searchResult;

   @Value("${application.url}")
   private String url;

   public void goTo() {
       this.driver.get(url);
   }

   public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }

    @Override
    public boolean isLoaded() {
        return this.searchComponent.isLoaded();
    }
}
