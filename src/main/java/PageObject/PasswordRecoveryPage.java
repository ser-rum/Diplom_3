package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PasswordRecoveryPage {

    WebDriver driver;

    public PasswordRecoveryPage(WebDriver driver){
        this.driver = driver;
    }

    private final By loginButton = By.className("Auth_link__1fOlj");


    public LoginPage clickLoginButton(){

        driver.findElement(loginButton).click();
        return new LoginPage(driver);

    }
}
