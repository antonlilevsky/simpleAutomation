package Helpers;

import core.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Find {
    public WebElement byXpath(String path){
        return Driver.get().findElement(By.xpath(path));
    }
}
