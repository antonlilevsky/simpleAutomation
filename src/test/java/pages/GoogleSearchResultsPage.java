package pages;

public class GoogleSearchResultsPage extends BasePage {
    private String URL = "https://www.google.com.ua/search?q=%s";

    public GoogleSearchResultsPage open(String request) {
        driver.get(String.format(URL, request));
        return this;
    }


}
