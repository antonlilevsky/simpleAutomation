package pages.ali;

import controls.Button;
import controls.Input;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class AliLoginPage extends BasePage {
    private String loginFrameId = "alibaba-login-box";

    @FindBy(id = "fm-login-id")
    private Input loginField;

    @FindBy(id="fm-login-password")
    private Input passwordField;

    @FindBy(id="fm-login-submit")
    private Button submitButton;

    public void login(){
        driver.switchTo().frame(loginFrameId);
        loginField.setText("antonlilevsky@gmail.com");
        passwordField.setText("275243");
        submitButton.click();
        driver.switchTo().parentFrame();
    }
}
