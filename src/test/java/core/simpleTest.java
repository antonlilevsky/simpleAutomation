package core;

import org.junit.Test;
import org.junit.runner.RunWith;
import pages.GoogleSearchPage;
import pages.GoogleSearchResultsPage;
import pages.ali.AliHomePage;

public class simpleTest extends BaseTest {

    @Test
    public void test1() {
        GoogleSearchPage searchPage = new GoogleSearchPage();
        searchPage.open();
        searchPage.doSearch("blah");
    }

    @Test
    public void test2() {
        GoogleSearchResultsPage page = new GoogleSearchResultsPage();
        page.open("aliexpress");
    }

    @Test
    public void test3() {
        AliHomePage aliPage = new AliHomePage();
        aliPage.open().openLogin().login();
    }

    @Test
    public void test4() {
        AliHomePage aliHomePage = new AliHomePage();
        aliHomePage.open().openMensBackpacksPage();
    }
}
