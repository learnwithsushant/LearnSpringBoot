package com.learningspring.online.LearnSpringBoot.page.google;

import com.learningspring.online.LearnSpringBoot.annotations.Page;
import com.learningspring.online.LearnSpringBoot.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Page
public class GooglePage extends Base {

    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private SearchResult searchResult;

    @Value("${application.url}")
    private String url;

    public void goTo(){
        this.driver.get(url);
    }

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public SearchResult getSearchResult() {
        return searchResult;
    }


    public void close(){
        this.driver.quit();
    }

    @Override
    public boolean isLoaded() {
        return this.searchComponent.isLoaded();
    }
}
