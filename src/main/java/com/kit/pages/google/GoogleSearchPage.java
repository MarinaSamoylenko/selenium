package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marina on 6/13/17.
 */
public class GoogleSearchPage extends GoogleBasePage{
    By searchLocator = By.name("q");
    //    @FindBy(name ="q")//
    private WebElement searchField;

    public GoogleSearchPage(WebDriver webDriver) {
      super(webDriver);


    }



    public void fillAndSubmitSearchData(String searchText) {
//        webDriverUtil.waitForExpectedCondition(ExpectedConditions.visibilityOfElementLocated(searchLocator));
        searchField = webDriver.findElement(searchLocator);
        searchField.sendKeys(searchText);
        searchField.submit();
    }
}