package pages.ali;

import controls.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AliHomePage extends BasePage {
    @FindBy(xpath = "//span[@class='account-unsigned']/a[@data-role='sign-link']")
    private Button signInButton;

    @FindBy(xpath = "//a[@class='sign-btn']")
    private Button secondSignInButton;

    private Button fuckingCouponCloseButton() {
        return Button.ByLocator(By.xpath("//div[@class='ui-window-content']/a"));
    };

    @FindBy(xpath = "//div[@class=\"ui-mask\"]")
    private WebElement mask;

    @FindBy(xpath = "//a[@data-role='goto-globalsite']")
    private WebElement goToGlobalSiteLink;

    @FindBy(xpath = "//div[contains(@class,'categories-main')]")
    private WebElement categoriesMainContainer;

    @FindBy(xpath = "//dl[contains(@class,'cl-item-shoes')]")
    private WebElement bagsAndShoesCategory;

    @FindBy(xpath = "//a[contains(text(), 'Men') and contains(text(),'Backpacks')]")
    private WebElement mensBackpacksSubCategory;

    private String URL = "https://www.aliexpress.com/";

    public AliHomePage open() {
        driver.get(URL);
        closeCouponOfferingIfPresent();
        goToGlobalSiteLink.click();
        return this;
    }

    public AliLoginPage openLogin() {
        moveMouseToElement((WebElement) signInButton);
        if (!isElementVisible(secondSignInButton.getDescription())) {
            signInButton.click();
            secondSignInButton.click();
        } else {
            waitForElementVisible(secondSignInButton.getWebElement());
            signInButton.click();
        }
        return new AliLoginPage();
    }

    public void closeCouponOfferingIfPresent() {
        if (isElementPresent(fuckingCouponCloseButton().getDescription())) {
            fuckingCouponCloseButton().click();
            waitForElementNotVisible(mask);
        }
    }

    public MensBackpacksPage openMensBackpacksPage() {
        moveMouseToElement(categoriesMainContainer);
        if (!bagsAndShoesCategory.isDisplayed()) {
            categoriesMainContainer.click();
            bagsAndShoesCategory.click();
        } else {
            waitForElementVisible(bagsAndShoesCategory);
            moveMouseToElement(bagsAndShoesCategory);
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementVisibleAndClickable(mensBackpacksSubCategory);
        moveMouseToElement(mensBackpacksSubCategory);
        mensBackpacksSubCategory.click();

        return new MensBackpacksPage();
    }


}
