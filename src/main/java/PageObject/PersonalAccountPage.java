package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PersonalAccountPage {

    WebDriver driver;

    public PersonalAccountPage(WebDriver driver){
        this.driver = driver;
    }


    private final By constructorButton = By.xpath("/html/body/div/div/header/nav/ul/li[1]/a/p");
    private final By logoLink = By.className("AppHeader_header__logo__2D0X2");
    private final By logoutButton = By.className("Account_button__14Yp3");
    private final By personalAccountText = By.className("Account_text__fZAIn");


    @Step("Клик по кнопке \"Конструктор\"")
    public MainPage clickConstructorButton(){

        driver.findElement(constructorButton).click();
        return new MainPage(driver);

    }

    @Step("Клик по центральному лого")
    public MainPage clickLogoLink(){

        driver.findElement(logoLink).click();
        return new MainPage(driver);

    }

    @Step("Клик по кнопке \"Выход\"")
    public LoginPage logoutUser(){

        driver.findElement(logoutButton).click();
        return new LoginPage(driver);

    }

    @Step("Получение текста \"В этом разделе вы можете изменить свои персональные данные\"")
    public String shouldBePersonalAccountText(){
        return driver.findElement(personalAccountText).getText();
    }
}
