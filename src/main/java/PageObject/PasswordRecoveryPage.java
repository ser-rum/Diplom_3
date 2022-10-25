package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage {

    WebDriver driver;

    public PasswordRecoveryPage(WebDriver driver){
        this.driver = driver;
    }

    private final By loginButton = By.className("Auth_link__1fOlj");


    @Step("Клик по кнопке \"Войти\"")
    public LoginPage clickLoginButton(){

        driver.findElement(loginButton).click();
        return new LoginPage(driver);

    }
}
