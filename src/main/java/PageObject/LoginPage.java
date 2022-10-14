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
    private final By registrationButton = By.xpath("/html/body/div/div/main/div/div/p[1]/a");
    private final By passwordRecoveryButton = By.xpath("/html/body/div/div/main/div/div/p[2]/a");
    private final By loginLogo = By.cssSelector("#root > div > main > div > h2");


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


    public PasswordRecoveryPage clickPasswordRecoveryButton(){

        driver.findElement(passwordRecoveryButton).click();
        return new PasswordRecoveryPage(driver);
    }

    public String shouldBeLoginText(){
        return driver.findElement(loginLogo).getText();
    }
}