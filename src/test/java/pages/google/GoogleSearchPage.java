package pages.google;

import controls.Input;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class GoogleSearchPage extends BasePage {
    private final static String URL = "https://google.com";

    @FindBy(xpath = "//Input[@title]")
    private Input input;

    public void open() {
        driver.get(URL);
    }

    public GoogleSearchResultsPage doSearch(String text) {
        input.setText(text);
        input.getWebElement().sendKeys(Keys.ENTER);
        return new GoogleSearchResultsPage();
    }
}
