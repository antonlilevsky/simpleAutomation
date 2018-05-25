package pages;

public class GoogleSearchResultsPage extends BasePage {
    private String URL = "https://www.google.com.ua/searchFor?q=%s";

    public GoogleSearchResultsPage searchFor(String request) {
        driver.get(String.format(URL, request));
        return this;
    }


}
