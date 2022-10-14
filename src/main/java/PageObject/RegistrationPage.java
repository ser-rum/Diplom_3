package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    private final By nameField = By.xpath("/html/body/div/div/main/div/form/fieldset[1]/div/div/input");
    private final By emailField = By.xpath("/html/body/div/div/main/div/form/fieldset[2]/div/div/input");
    private final By passwordField = By.cssSelector(".input_type_password > input:nth-child(2)");
    private final By registrationButton = By.className("button_button__33qZ0");
    private final By loginButton = By.className("Auth_link__1fOlj");
    private final By errorMessage = By.className("input__error");


    public LoginPage registerUser(String name, String email, String password) {

        driver.findElement(nameField).sendKeys(name);
        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(registrationButton).click();
        return new LoginPage(driver);

    }

    public LoginPage clickLoginButton(){

        driver.findElement(loginButton).click();
        return new LoginPage(driver);

    }

    public String shouldBeErrorText(){

        return driver.findElement(errorMessage).getText();
    }
}
