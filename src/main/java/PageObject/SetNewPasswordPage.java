package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SetNewPasswordPage {

    WebDriver driver;

    public SetNewPasswordPage(WebDriver driver){
        this.driver = driver;
    }


    private final By passwordField = By.cssSelector("[placeholder = '* Имя']");
    private final By codeField = By.cssSelector("[placeholder = '* Имя']");
    private final By saveButton = By.cssSelector("[placeholder = '* Имя']");
    private final By loginButton = By.className("");


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
