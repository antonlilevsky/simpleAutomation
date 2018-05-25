package controls;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public abstract class ControlBase {
    static WebDriver driver = Driver.get();

    By element;

    public WebElement getWebElement() {
        return driver.findElement(element);
    }

    public By getDescription() {
        return element;
    }

    public void click() {
        driver.findElement(element).click();
    }

    //TODO
//    public static <? extends ControlBase> byText(String text) {
//        return new <?>(By.xpath(String.format("//*[text()='%s']", text)));
//    }
}
