package PageObject;

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
    private final By constructBurgerText = By.className("AppHeader_header__link_active__1IkJo");


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