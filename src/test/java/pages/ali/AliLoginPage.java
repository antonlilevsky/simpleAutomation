package pages.ali;

import controls.Button;
import controls.Input;
import org.openqa.selenium.By;
import pages.BasePage;

public class AliLoginPage extends BasePage {

    private String loginFrameId = "alibaba-login-box";

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
        return Input.byXpath( "//input[@id=\"fm-login-password\"]");
//        return Input.create().byXpath(...);
    }

    private Button submitButton() {
        return new Button( By.xpath("//input[@id='fm-login-submit']"));
    }


}
