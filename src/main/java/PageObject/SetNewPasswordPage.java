package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SetNewPasswordPage {

    WebDriver driver;

    public SetNewPasswordPage(WebDriver driver){
        this.driver = driver;
    }


    private final By passwordField = By.cssSelector(".input_type_password > input:nth-child(2)");
    private final By codeField = By.cssSelector(".input_type_text > label:nth-child(1)");
    private final By saveButton = By.className("button_button__33qZ0");
    private final By loginButton = By.className("Auth_link__1fOlj");


    public LoginPage clickSaveButton(String password, String code){

        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(codeField).sendKeys(code);
        driver.findElement(saveButton).click();
        return new LoginPage(driver);

    }

    public LoginPage clickLoginButton(){

        driver.findElement(loginButton).click();
        return new LoginPage(driver);

    }
}
