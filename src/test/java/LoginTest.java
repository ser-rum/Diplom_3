import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.PasswordRecoveryPage;
import PageObject.RegistrationPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

import static PageObject.BaseUrl.BASE_URL;

public class LoginTest extends BaseTestForLogin {

    String placedOrderMessage = "Оформить заказ";
    String email = "ser_rum@praktikum.ru";
    String password = "123123";

    public LoginTest(String browser) {
        super(browser);
    }


    @Test
    @DisplayName("Авторизация пользователя с помощью кнопки \"Войти в аккаунт\"")
    public void testLoginByLoginButton() {

        driver.get(BASE_URL);
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickLoginButton();
        MainPage mainPageAgain = loginPage.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));

    }

    @Test
    @DisplayName("Авторизация пользователя с помощью кнопки \"Личный Кабинет\"")
    public void testLoginByPersonalAccountButton(){

        driver.get(BASE_URL);
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickPersonalAccountButtonWithoutLogin();
        MainPage mainPageAgain = loginPage.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));

    }

    @Test
    @DisplayName("Авторизация пользователя с помощью кнопки \"Войти\" в форме регистрации")
    public void testLoginByButtonInRegistrationForm() {

        driver.get(BASE_URL + "/register");
        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPageAgain = registrationPage.clickLoginButton();
        MainPage mainPageAgain = loginPageAgain.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));

    }

    @Test
    @DisplayName("Авторизация пользователя с помощью кнопки \"Войти\" в форме восстановления пароля")
    public void testLoginByButtonInPasswordRecoveryForm() {

        driver.get(BASE_URL + "/forgot-password");
        PasswordRecoveryPage passwordRecoveryPage = new PasswordRecoveryPage(driver);
        LoginPage loginPageAgain = passwordRecoveryPage.clickLoginButton();
        MainPage mainPageAgain = loginPageAgain.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));

    }
}