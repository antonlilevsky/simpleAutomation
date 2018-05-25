package controls;

import org.openqa.selenium.By;

public class Input extends ControlBase {

    public Input(By by) {
        element = by;
    }

    public static Input byId(String id) {
        return new Input(By.xpath(String.format("//*[@id='%s']", id)));
    }

    public static Input byTitle(String title) {
        return new Input(By.xpath(String.format("//*[@title='%s']", title)));
    }

    public static Input byLocator(By locator) {
        return new Input(locator);
    }

    public static Input byXpath(String locator) {
        return new Input(By.xpath(locator));
    }

    public void setText(String text) {
        getWebElement().clear();
        getWebElement().sendKeys(text);
    }
}
