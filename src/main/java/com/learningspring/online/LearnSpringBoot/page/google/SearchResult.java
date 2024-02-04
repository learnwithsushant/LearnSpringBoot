package com.learningspring.online.LearnSpringBoot.page.google;

import com.learningspring.online.LearnSpringBoot.annotations.PageFragment;
import com.learningspring.online.LearnSpringBoot.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
@PageFragment
public class SearchResult extends Base{

    @FindBy(css="span.VuuXrf")
    private List<WebElement> getResults;

    public int getResultCount(){
        return this.getResults.size();
    }


    @Override
    public boolean isLoaded() {
        return this.wait.until(d->!this.getResults.isEmpty());
    }
}
