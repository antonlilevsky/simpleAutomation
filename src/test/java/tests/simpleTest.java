package tests;

import org.junit.Test;
import pages.google.GoogleSearchPage;
import pages.google.GoogleSearchResultsPage;
import pages.ali.AliHomePage;
import pages.ali.MensBackpacksPage;

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
        page.searchFor("aliexpress");
    }

    @Test
    public void test3() {
        AliHomePage aliPage = new AliHomePage();
        aliPage.open().openLogin().login();
    }

    @Test
    public void test4() {
        AliHomePage aliHomePage = new AliHomePage();
        MensBackpacksPage backpacksPage = aliHomePage.open().openMensBackpacksPage();
        //backpacksPage

    }
}
