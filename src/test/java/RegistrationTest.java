import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.RegistrationPage;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest extends BaseTest{

    private final String userName = "userName";
    private final String userEmail = RandomStringUtils.randomAlphabetic(10) + "@ya.ru";
    private final String validUserPassword = RandomStringUtils.randomAlphabetic(6);
    private final String invalidUserPassword = RandomStringUtils.randomAlphabetic(5);


    @Test
    public void testRegistrationWithValidPassword() {

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickLoginButton();
        RegistrationPage registrationPage = loginPage.clickRegistrationButton();
        LoginPage loginPageAgain = registrationPage.registerUser(userName,
                userEmail, validUserPassword);
        Assert.assertTrue(loginPageAgain.shouldBeLoginText().contains("Вход"));

    }

    @Test
    public void testRegistrationWithInvalidPassword() {

        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickLoginButton();
        RegistrationPage registrationPage = loginPage.clickRegistrationButton();
        registrationPage.registerUser(userName, userEmail, invalidUserPassword);
        Assert.assertTrue(registrationPage.shouldBeErrorText().contains("Некорректный пароль"));

    }
}


//                RandomStringUtils.randomAlphanumeric(10) + "@ya.ru",
//                        "P@ssw0rd",
//                        RandomStringUtils.randomAlphabetic(10)
