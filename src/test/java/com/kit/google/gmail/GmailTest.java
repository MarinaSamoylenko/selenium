package com.kit.google.gmail;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.google.gmail.AccountsPage;
import com.kit.pages.google.gmail.GmailPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

/**
 * Created by Marina on 6/18/17.
 */
public class GmailTest extends WebDriverTestBase {
    private String gmailLink = "https://www.gmail.com";
    private String myEmail = "marisabell.samoylenko@gmail.com";
    private String password = "ilovemyself44569";

    @Test
public void loginTest(){
        GmailPage gmailPage = new GmailPage(webDriver);
        gmailPage.openPage(gmailLink);
        //        gmailPage.clickEnter();
        AccountsPage accountsPage = new AccountsPage(webDriver);
    accountsPage.enterEmailAndClick(myEmail);
    accountsPage.enterPassword(password);
    }
    }

