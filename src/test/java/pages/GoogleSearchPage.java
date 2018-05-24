package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearchPage extends BasePage{
    private final static String URL = "https://google.com";

    @FindBy(xpath = "//Input[@title]")
    private WebElement input;

    public void open() {
        driver.get(URL);
    }

    public GoogleSearchResultsPage doSearch(String text) {
        input.sendKeys(text);
        input.sendKeys(Keys.ENTER);
        return new GoogleSearchResultsPage();
    }




}
