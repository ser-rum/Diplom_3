package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {

    WebDriver driver;


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    private final By personalAccountButton = By.xpath("");
    private final By loginButton = By.xpath("");


    public PersonalAccountPage clickPersonalAccountButton() {

        driver.findElement(personalAccountButton).click();
        return new PersonalAccountPage(driver);

    }

    public LoginPage clickLoginButton() {

        driver.findElement(loginButton).click();
        return new LoginPage(driver);

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