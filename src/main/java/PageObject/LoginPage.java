package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }


    private final By emailField = By.cssSelector("[type = \"text\"]");
    private final By passwordField = By.cssSelector("[type = \"password\"]");
    private final By loginButton = By.className("button_button__33qZ0");
    private final By loginLogo = By.cssSelector("#root > div > main > div > h2");


    public MainPage login(String email, String password) {

        driver.findElement(emailField).sendKeys(email);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        return new MainPage(driver);

    }

    public String shouldBeLoginText(){
        return driver.findElement(loginLogo).getText();
    }
}