import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.PasswordRecoveryPage;
import PageObject.RegistrationPage;
import org.junit.Assert;
import org.junit.Test;

import static PageObject.BASE_URL.BASE_URL;

public class LoginTest extends BaseForLoginTest {

    String placedOrderMessage = "Оформить заказ";
    String email = "ser_rum@praktikum.ru";
    String password = "123123";


    @Test
    public void testLoginByLoginButton() {

        driver.get(BASE_URL);
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickLoginButton();
        MainPage mainPageAgain = loginPage.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));

    }

    @Test
    public void testLoginByPersonalAccountButton(){

        driver.get(BASE_URL);
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickPersonalAccountButtonWithoutLogin();
        MainPage mainPageAgain = loginPage.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));

    }

    @Test
    public void testLoginByButtonInRegistrationForm() {

        driver.get(BASE_URL + "/register");
        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPageAgain = registrationPage.clickLoginButton();
        MainPage mainPageAgain = loginPageAgain.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));

    }

    @Test
    public void testLoginByButtonInPasswordRecoveryForm() {

        driver.get(BASE_URL + "/forgot-password");
        PasswordRecoveryPage passwordRecoveryPage = new PasswordRecoveryPage(driver);
        LoginPage loginPageAgain = passwordRecoveryPage.clickLoginButton();
        MainPage mainPageAgain = loginPageAgain.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));

    }
}