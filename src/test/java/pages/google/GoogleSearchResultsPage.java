package pages.google;

import pages.BasePage;

public class GoogleSearchResultsPage extends BasePage {
    private String URL = "https://www.google.com.ua/search?q=%s";

    public GoogleSearchResultsPage searchFor(String request) {
        driver.get(String.format(URL, request));
        return this;
    }


}
