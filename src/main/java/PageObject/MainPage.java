package PageObject;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By personalAccountButton = By.xpath("/html/body/div/div/header/nav/a");
    private final By loginButton = By.className("button_button__33qZ0");
    private final By placeOrderButton = By.cssSelector("#root > div > main > " +
            "section.BurgerConstructor_basket__29Cd7.mt-25 > div > button");
    private final By bunButton = By.cssSelector("div.tab_tab__1SPyG:nth-child(1) > span:nth-child(1)");
    private final By sauceButton = By.cssSelector("div.tab_tab__1SPyG:nth-child(2) > span:nth-child(1)");
    private final By fillingButton = By.cssSelector("div.tab_tab__1SPyG:nth-child(3) > span:nth-child(1)");
    private final By bunText = By.cssSelector("h2.text_type_main-medium:nth-child(1)");
    private final By sauceText = By.cssSelector("h2.text:nth-child(3)");
    private final By fillingText = By.cssSelector("h2.text:nth-child(5)");
    private final By constructBurgerText = By.className("text_type_main-large");


    @Step("Клик по кнопке \"Личный Кабинет\"")
    public PersonalAccountPage clickPersonalAccountButton() {

        driver.findElement(personalAccountButton).click();
        return new PersonalAccountPage(driver);

    }

    @Step("Клик по кнопке \"Личный Кабинет\" без авторизации")
    public LoginPage clickPersonalAccountButtonWithoutLogin() {

        driver.findElement(personalAccountButton).click();
        return new LoginPage(driver);

    }

    @Step("Клик по кнопке \"Войти в аакаунт\"")
    public LoginPage clickLoginButton() {

        driver.findElement(loginButton).click();
        return new LoginPage(driver);

    }

    @Step("Клик по кнопке \"Булки\"")
    public void clickBunButton() {
        driver.findElement(bunButton).click();
    }

    @Step("Клик по кнопке \"Соусы\"")
    public void clickSauceButton() {
        driver.findElement(sauceButton).click();
    }

    @Step("Клик по кнопке \"Начинки\"")
    public void clickFillingButton() {
        driver.findElement(fillingButton).click();
    }

    @Step("Получение текста кнопки \"Оформить заказ\"")
    public String shouldBePLaceOrderButton(){
        return driver.findElement(placeOrderButton).getText();
    }

    @Step("Получение текста банера \"Соберите бургер\"")
    public String shouldBeConstructBurgerText(){
        return driver.findElement(constructBurgerText).getText();
    }

    @Step("Получение текста банера области \"Булки\"")
    public String shouldBeBunText(){
        return driver.findElement(bunText).getText();
    }

    @Step("Получение текста банера области \"Соусы\"")
    public String shouldBeSauceText(){
        return driver.findElement(sauceText).getText();
    }

    @Step("Получение текста банера области \"Начинки\"")
    public String shouldBeFillingText(){
        return driver.findElement(fillingText).getText();
    }
}