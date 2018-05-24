package controls;

import org.openqa.selenium.By;

public class Button extends ControlBase {
//    By element;

    public Button(By by) {
        element = by;
    }

    public static Button ById(String id) {
        return new Button(By.xpath(String.format("//*[@id='%s']", id)));
    }

    public static Button ByTitle(String title) {
        return new Button(By.xpath(String.format("//*[@title='%s']", title)));
    }

    public static Button ByLocator(By locator) {
        return new Button(locator);
    }

    public Button click() {
        driver.findElement(element).click();
        return new Button(element);
    }


}
