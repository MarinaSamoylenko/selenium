package com.kit.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Marina on 6/16/17.
 */
public class WebDriverUtil {
    private WebDriver webDriver;
    private WebDriverWait webDriverWait;

    public WebDriverUtil(WebDriver webDriver) {
        this.webDriver = webDriver;
        webDriverWait = new WebDriverWait(webDriver, 15);
    }
    public WebElement waitForExpectedCondition (ExpectedCondition expectedCondition){
        return(WebElement) webDriverWait.until(expectedCondition); //ждет пока єлемнт клік

    }

}
