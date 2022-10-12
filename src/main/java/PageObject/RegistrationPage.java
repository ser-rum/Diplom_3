package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

    WebDriver driver;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
    }

    private final By nameField = By.cssSelector("[placeholder = '* Адрес: куда привезти заказ']");
    private final By emailField = By.cssSelector("[placeholder = '* Имя']");
    private final By passwordField = By.cssSelector("[placeholder = '* Фамилия']");
    private final By registrationButton = By.cssSelector("[placeholder = '* Адрес: куда привезти заказ']");
    private final By loginButton = By.cssSelector("[placeholder = '* Адрес: куда привезти заказ']");


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
}
