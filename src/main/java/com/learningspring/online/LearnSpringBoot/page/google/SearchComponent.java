package com.learningspring.online.LearnSpringBoot.page.google;

import com.learningspring.online.LearnSpringBoot.annotations.PageFragment;
import com.learningspring.online.LearnSpringBoot.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;
@PageFragment
public class SearchComponent extends Base {

    @FindBy(css="textarea[type=\"search\"]")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private List<WebElement> searchButtons;

    public void search(final String keyword){
            this.searchBox.sendKeys(keyword);
            this.searchBox.sendKeys(Keys.TAB);
            this.searchButtons
                    .stream()
                    .filter(e->e.isDisplayed() && e.isEnabled())
                    .findFirst()
                    .ifPresent(WebElement::click);
    }


    @Override
    public boolean isLoaded() {
        return this.wait.until(d -> this.searchBox.isDisplayed());
    }
}
