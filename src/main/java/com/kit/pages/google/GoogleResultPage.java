package com.kit.pages.google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marina on 6/13/17.
 */
//public class GoogleResultPage {
//    private WebDriver webDriver;
//    By linkLocator = By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/div/h3/a");//нашлі результат для ссилкі которую будем веріфіціровать
//    WebElement link;
//    public GoogleResultPage(WebDriver webDriver) {
//        this.webDriver = webDriver;
//    }
//    public WebElement findLink (){
//        link = webDriver.findElement(linkLocator);
//        return link;
//    }
//}
public class GoogleResultPage extends GoogleBasePage{


    By linkLocator = By.xpath(".//*[@id='rso']/div[2]/div/div[1]/div/div/h3/a");
    private WebElement link;

    public GoogleResultPage(WebDriver webDriver) {
            super(webDriver);

        }

    public String getLinkText(){
        link =  webDriverUtil.waitForExpectedCondition(ExpectedConditions.visibilityOfElementLocated(linkLocator));
        return link.getText();
    }

    public void clickLink(){
        link.click();
    }
}