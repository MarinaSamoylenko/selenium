package com.kit.core;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.EnumUtils;
import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class WebDriverTestBase {
    protected WebDriver webDriver;
    private String browser = System.getProperty("browser");

    @BeforeClass
    public void setUp() {
        //Automatically downloads and sets up the latest driver
        setBrowser();
        webDriver.manage().window().maximize();
    }

    private void setBrowser() {
        Browser runBrowser = EnumUtils.isValidEnum(Browser.class, browser) ?
                Browser.valueOf(browser.toUpperCase()) : Browser.CHROME;
        switch (runBrowser) {
            case CHROME:
                ChromeDriverManager.getInstance().version("2.9").setup();//version for driver
                webDriver = new ChromeDriver();
//                webDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
                break;
            case FF:
                FirefoxDriverManager.getInstance().version("0.13.0").setup();
                webDriver = new FirefoxDriver();
                break;
        }
    }

    @AfterClass
    public void tearDown() {
        //Closes a browser
        webDriver.close();
        //Closes a browser's tab
//        webDriver.quit();
    }
}