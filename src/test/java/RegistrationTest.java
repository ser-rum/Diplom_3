import PageObject.LoginPage;
import PageObject.RegistrationPage;
import io.qameta.allure.junit4.DisplayName;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.junit.Test;

public class RegistrationTest extends BaseTestForRegistration {

    private final String userName = "userName";
    private final String userEmail = RandomStringUtils.randomAlphabetic(10) + "@ya.ru";
    private final String validUserPassword = RandomStringUtils.randomAlphabetic(6);
    private final String invalidUserPassword = RandomStringUtils.randomAlphabetic(5);

    public RegistrationTest(String browser) {
        super(browser);
    }


    @Test
    @DisplayName("Регистрация нового пользователя с корректным паролем")
    public void testRegistrationWithValidPassword() throws InterruptedException {

        RegistrationPage registrationPage = new RegistrationPage(driver);
        LoginPage loginPageAgain = registrationPage.registerUser(userName,
                userEmail, validUserPassword);
        Thread.sleep(1000);
        Assert.assertEquals("Вход", loginPageAgain.shouldBeLoginText());

    }

    @Test
    @DisplayName("Регистрация нового пользователя с некорректным паролем")
    public void testRegistrationWithInvalidPassword() {

        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.registerUser(userName, userEmail, invalidUserPassword);
        Assert.assertEquals("Некорректный пароль", registrationPage.shouldBeErrorText());

    }
}