package pages.ali;

import controls.Button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.BasePage;

public class AliHomePage extends BasePage {

    Actions actions = new Actions(driver);

    private String URL = "https://www.aliexpress.com/";

    public AliHomePage open() {
        driver.get(URL);
        closeCouponOfferingIfPresent();
        goToGlobalSiteLink().click();
        return this;
    }

    public AliLoginPage openLogin() {
        actions.moveToElement(signInButton().getWebElement()).build().perform();

        if (!isElementVisible(secondSignInButton().getDescription())) {
            signInButton().click();
            secondSignInButton().click();
        } else {
            waitForElementVisible(secondSignInButton().getWebElement());
            signInButton().click();
        }

        return new AliLoginPage();
    }

    public void closeCouponOfferingIfPresent() {
        if (waitForElementVisible(fuckingCouponCloseButton().getWebElement(), 3) != null) {
            fuckingCouponCloseButton().click();
            waitForElementNotVisible(mask());
        }
    }

    public MensBackpacksPage openMensBackpacksPage() {
        moveMouseToElement(categoriesMainContainer());
        if (!bagsAndShoesCategory().isDisplayed()) {
            categoriesMainContainer().click();
            bagsAndShoesCategory().click();
        } else {
            waitForElementVisible(bagsAndShoesCategory());
            moveMouseToElement(bagsAndShoesCategory());
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        waitForElementVisibleAndClickable(mensBackpacksSubCategory());
        moveMouseToElement(mensBackpacksSubCategory());
        mensBackpacksSubCategory().click();
        return new MensBackpacksPage();
    }

    public void moveMouseToElement(WebElement element) {
        actions.moveToElement(element).build().perform();
    }

    private Button signInButton() {
        return new Button(By.xpath("//span[@class='account-unsigned']/a[@data-role='sign-link']"));
    }

    private Button secondSignInButton() {
        return new Button(By.xpath("//a[@class='sign-btn']"));
    }

    private Button fuckingCouponCloseButton() {
        return Button.ByLocator(By.xpath("//div[@class=\"ui-window-content\"]/a"));
    }

    private WebElement mask() {
        return driver.findElement(By.xpath("//div[@class=\"ui-mask\"]"));
    }

    private WebElement goToGlobalSiteLink() {
        return driver.findElement(By.xpath("//a[@data-role=\"goto-globalsite\"]"));
    }

    private WebElement categoriesMainContainer() {
        return driver.findElement(By.xpath("//div[contains(@class,'categories-main')]"));
    }

    private WebElement bagsAndShoesCategory() {
        return driver.findElement(By.xpath("//dl[contains(@class,'cl-item-shoes')]"));
    }

    private WebElement mensBackpacksSubCategory() {
        return driver.findElement(By.xpath("//a[contains(text(), 'Men') and contains(text(),'Backpacks')]"));
    }
}
