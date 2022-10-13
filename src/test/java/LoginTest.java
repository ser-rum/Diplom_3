import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.PasswordRecoveryPage;
import PageObject.RegistrationPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTest extends BaseTest{

    String placedOrderMessage = "Оформить заказ";
    String email = "ser_rum@praktikum.ru";
    String password = "123123";

    @Test
    public void testLoginByLoginButton() {

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickLoginButton();
        MainPage mainPageAgain = loginPage.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));

    }

    @Test
    public void testLoginByPersonalAccountButton(){
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickPersonalAccountButtonWithoutLogin();
        MainPage mainPageAgain = loginPage.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));
    }

    @Test
    public void testLoginByButtonInRegistrationForm() {

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickLoginButton();
        RegistrationPage registrationPage = loginPage.clickRegistrationButton();
        LoginPage loginPageAgain = registrationPage.clickLoginButton();
        MainPage mainPageAgain = loginPageAgain.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));

    }

    @Test
    public void testLoginByButtonInPasswordRecoveryForm() {

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickLoginButton();
        PasswordRecoveryPage passwordRecoveryPage = loginPage.clickPasswordRecoveryButton();
        LoginPage loginPageAgain = passwordRecoveryPage.clickLoginButton();
        MainPage mainPageAgain = loginPageAgain.login(email, password);
        Assert.assertTrue(mainPageAgain.shouldBePLaceOrderButton().contains(placedOrderMessage));

    }
}