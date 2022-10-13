package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {

    WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By personalAccountButton = By.xpath("");
    private final By loginButton = By.xpath("");
    private final By placeOrderButton = By.xpath("");
    private final By bunButton = By.xpath("");
    private final By sauceButton = By.xpath("");
    private final By fillingButton = By.xpath("");
    private final By bunText = By.xpath("");
    private final By sauceText = By.xpath("");
    private final By fillingText = By.xpath("");
    private final By constructBurgerText = By.xpath("");


    public PersonalAccountPage clickPersonalAccountButton() {

        driver.findElement(personalAccountButton).click();
        return new PersonalAccountPage(driver);

    }

    public LoginPage clickPersonalAccountButtonWithoutLogin() {

        driver.findElement(personalAccountButton).click();
        return new LoginPage(driver);

    }

    public LoginPage clickLoginButton() {

        driver.findElement(loginButton).click();
        return new LoginPage(driver);

    }

    public void clickBunButton() {
        driver.findElement(bunButton).click();
    }

    public void clickSauceButton() {
        driver.findElement(sauceButton).click();
    }

    public void clickFillingButton() {
        driver.findElement(fillingButton).click();
    }

    public String shouldBePLaceOrderButton(){
        return driver.findElement(placeOrderButton).getText();
    }

    public String shouldBeConstructBurgerText(){
        return driver.findElement(constructBurgerText).getText();
    }

    public String shouldBeBunText(){
        return driver.findElement(bunText).getText();
    }

    public String shouldBeSauceText(){
        return driver.findElement(sauceText).getText();
    }

    public String shouldBeFillingText(){
        return driver.findElement(fillingText).getText();
    }
}

//
//    WebElement element = driver.findElement(bottomOrderButton);
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);


//    public String shouldBeExactText(By importantQuestionSelector,
//                                    By importantAnswerSelector){
//
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",
//                driver.findElement(importantQuestionsBlock));
//        driver.findElement(importantQuestionSelector).click();
//        return driver.findElement(importantAnswerSelector).getText();
//
//    }