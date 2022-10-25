import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.PersonalAccountPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class PersonalAccountTest extends BaseTestForAccount {

    public PersonalAccountTest(String browser) {
        super(browser);
    }

    @Test
    @DisplayName("Проверка перехода к конструктору бургеров")
    public void testTransferToConstructor(){

        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        MainPage mainPageAgain = personalAccountPage.clickConstructorButton();
        Assert.assertEquals("Соберите бургер", mainPageAgain.shouldBeConstructBurgerText());

    }

    @Test
    @DisplayName("Проверка перехода на главную страницу через центральное лого")
    public void testTransferByLogoLink(){

        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        MainPage mainPageAgain = personalAccountPage.clickLogoLink();
        Assert.assertEquals("Соберите бургер", mainPageAgain.shouldBeConstructBurgerText());

    }

    @Test
    @DisplayName("Проверка выхода из аккаунта")
    public void testLogout(){

        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        LoginPage loginPage = personalAccountPage.logoutUser();
        Assert.assertEquals("Вход", loginPage.shouldBeLoginText());

    }
}
