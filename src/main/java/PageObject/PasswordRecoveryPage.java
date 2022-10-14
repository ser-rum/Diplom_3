package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage {

    WebDriver driver;

    public PasswordRecoveryPage(WebDriver driver){
        this.driver = driver;
    }

    private final By emailField = By.cssSelector("input.text");
    private final By recoveryButton = By.className("button_button__33qZ0");
    private final By loginButton = By.className("Auth_link__1fOlj");


    public SetNewPasswordPage recoverPassword(String email) {

        driver.findElement(emailField).sendKeys(email);
        driver.findElement(recoveryButton).click();
        return new SetNewPasswordPage(driver);

    }

    public LoginPage clickLoginButton(){

        driver.findElement(loginButton).click();
        return new LoginPage(driver);

    }
}
