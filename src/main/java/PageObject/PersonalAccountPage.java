package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAccountPage {

    WebDriver driver;

    public PersonalAccountPage(WebDriver driver){
        this.driver = driver;
    }


    private final By constructorButton = By.cssSelector("[placeholder = '* Имя']");
    private final By logoLink = By.cssSelector("[placeholder = '* Имя']");
    private final By logoutButton = By.cssSelector("[placeholder = '* Имя']");
    private final By personalAccountText = By.cssSelector("[placeholder = '* Имя']");


    public MainPage clickConstructorButton(){

        driver.findElement(constructorButton).click();
        return new MainPage(driver);

    }

    public MainPage clickLogoLink(){

        driver.findElement(logoLink).click();
        return new MainPage(driver);

    }

    public LoginPage logoutUser(){

        driver.findElement(logoutButton).click();
        return new LoginPage(driver);

    }

    public String shouldBePersonalAccountText(){
        return driver.findElement(personalAccountText).getText();
    }
}
