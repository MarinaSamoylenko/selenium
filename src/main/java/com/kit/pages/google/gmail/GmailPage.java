package com.kit.pages.google.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Marina on 6/18/17.
 */
public class GmailPage {
    protected WebDriver webDriver;
    private WebElement button;
    By buttonLocator = By.cssSelector(".gmail-nav__nav-link.gmail-nav__nav-link__sign-in");
    public GmailPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }
    public void openPage(String link){
        webDriver.get(link);
    }
    public void clickEnter (){
        button = webDriver.findElement(buttonLocator);
        button.click();
    }
}
