package pages.ali;

import controls.Button;
import controls.Input;
import core.BaseTest;
import org.openqa.selenium.By;
import pages.BasePage;

public class AliLoginPage extends BasePage {


    public void login(){
        driver.switchTo().frame(loginFrameId);
        loginField().setText("antonlilevsky@gmail.com");
        passwordField().setText("275243");
        submitButton().click();
        driver.switchTo().parentFrame();
    }

    private Input loginField() {
        return new Input( By.xpath("//input[@id=\"fm-login-id\"]"));
    }

    private Input passwordField() {
        return new Input( By.xpath("//input[@id=\"fm-login-password\"]"));
    }

    private Button submitButton() {
        return new Button( By.xpath("//input[@id='fm-login-submit']"));
    }

    private String loginFrameId = "alibaba-login-box";
}
