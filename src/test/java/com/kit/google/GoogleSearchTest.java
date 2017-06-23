package com.kit.google;

import com.kit.core.WebDriverTestBase;
import com.kit.pages.google.GoogleResultPage;
import com.kit.pages.google.GoogleSearchPage;
import org.testng.annotations.Test;
import ru.yandex.qatools.allure.annotations.Title;

import static org.testng.Assert.assertTrue;

public class GoogleSearchTest extends WebDriverTestBase {
    private String googleSearch = "https://www.google.com.ua/";
    private String searchText = "Selenium";
@Title("Google search test - positive scenarie")
    @Test
    public void searchTest() {
//        GoogleSearchPage googleSearchPage = PageFactory.initElements(webDriver,GoogleSearchPage.class);
        GoogleSearchPage googleSearchPage = new GoogleSearchPage(webDriver);
        googleSearchPage.open(googleSearch);
        googleSearchPage.fillAndSubmitSearchData(searchText);
        GoogleResultPage googleSearchResultPage = new GoogleResultPage(webDriver);
        assertTrue(googleSearchResultPage.getLinkText().contains(searchText));
    }
}