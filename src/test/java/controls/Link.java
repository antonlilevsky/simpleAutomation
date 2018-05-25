package controls;

import org.openqa.selenium.By;

public class Link extends ControlBase {

    public Link(By by) {
        element = by;
    }

    public static Link byId(String id) {
        return new Link(By.xpath(String.format("//*[@id='%s']", id)));
    }

    public static Link byTitle(String title) {
        return new Link(By.xpath(String.format("//*[@title='%s']", title)));
    }

    public static Link byLocator(By locator) {
        return new Link(locator);
    }

    public static Link byXpath(String locator) {
        return new Link(By.xpath(locator));
    }
}
