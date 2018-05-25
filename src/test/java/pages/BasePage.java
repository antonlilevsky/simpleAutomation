package pages;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class BasePage {
    protected static WebDriver driver;

    Actions actions = new Actions(driver);

    public BasePage() {
        driver = Driver.get();
        PageFactory.initElements(driver, this);
    }

    public WebElement waitForElementVisible(WebElement element) {
        return waitForElementVisible(element, 10);
    }

    public WebElement waitForElementVisible(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void waitForElementNotVisible(WebElement element) {
        waitForElementNotVisible(element, 10);
    }

    public void waitForElementNotVisible(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public WebElement waitForElementClickable(WebElement element) {
        return waitForElementClickable(element, 10);
    }

    public WebElement waitForElementClickable(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public WebElement waitForElementVisibleAndClickable(WebElement element) {
        return waitForElementVisibleAndClickable(element, 10);
    }

    public WebElement waitForElementVisibleAndClickable(WebElement element, int time) {
        waitForElementClickable(element, time);
        return waitForElementVisible(element, time);
    }

    public boolean isElementPresent(By element) {
        List<WebElement> elList = driver.findElements(element);
        return !elList.isEmpty();
    }

    public boolean isElementVisible(By element) {
        List<WebElement> elList = driver.findElements(element);
        return !elList.isEmpty() && elList.get(0).isDisplayed();
    }

    public void moveMouseToElement(WebElement element) {
        actions.moveToElement(element).build().perform();
    }


}
