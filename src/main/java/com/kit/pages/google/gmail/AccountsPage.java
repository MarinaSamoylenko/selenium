package com.kit.pages.google.gmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by Marina on 6/18/17.
 */
public class AccountsPage {
    protected WebDriver webDriver;
    private WebElement emailField;
    private WebElement nextButtonEmail;
    private WebElement nextButtonPassword;
    private WebElement passwordField;
    By emailLocator = By.id("identifierId");
    By nextButtonEmailLocator = By.cssSelector(".RveJvd.snByac");
    By passwordLocator = By.xpath(".//*[@id='password']/div[1]/div/div[1]/input");
    By nextButtonPasswordLocator = By.xpath(".//*[@id='passwordNext']/content/span");



    public AccountsPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void enterEmailAndClick(String email) {
        emailField = webDriver.findElement(emailLocator);
        emailField.clear();
        emailField.sendKeys(email);
        nextButtonEmail = webDriver.findElement(nextButtonEmailLocator);
        nextButtonEmail.click();

    }

    public void enterPassword(String password) {
        passwordField = webDriver.findElement(passwordLocator);
        passwordField.sendKeys(password);
        nextButtonPassword = webDriver.findElement(nextButtonPasswordLocator);
        nextButtonPassword.click();



    }
}
