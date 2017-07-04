package com.kit.google;

import com.kit.core.WebDriverTestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by Marina on 6/30/17.
 */
public class W3 extends WebDriverTestBase {
    @Test
    public void selectFrame(){
        webDriver.get("http://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");
        webDriver.switchTo().frame("iframeresult");
        Select make = new Select(webDriver.findElement(By.xpath("html/body/select")));


    }
}
