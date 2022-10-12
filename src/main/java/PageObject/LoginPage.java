package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    private final By emailField = By.cssSelector("[placeholder = '* Имя']");
    private final By passwordField = By.cssSelector("[placeholder = '* Фамилия']");
    private final By loginButton = By.cssSelector("[placeholder = '* Адрес: куда привезти заказ']");
    private final By registrationButton = By.cssSelector("[placeholder = '* Адрес: куда привезти заказ']");


    public MainPage login(String email, String password) {

        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new MainPage(driver);

    }

    public RegistrationPage clickRegistrationButton(){
        driver.findElement(registrationButton).click();
        return new RegistrationPage(driver);
    }
}
