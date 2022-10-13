import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.PersonalAccountPage;
import org.junit.Assert;
import org.junit.Test;

public class PersonalAccountTest extends BaseTest{

    @Test
    public void testTransferToConstructor(){

        MainPage mainPage = new MainPage(driver);
        PersonalAccountPage personalAccountPage = mainPage.clickPersonalAccountButton();
        MainPage mainPageAgain = personalAccountPage.clickConstructorButton();
        Assert.assertTrue(mainPageAgain.shouldBeConstructBurgerText().contains("Соберите бургер"));

    }

    @Test
    public void testTransferByLogoLink(){

        MainPage mainPage = new MainPage(driver);
        PersonalAccountPage personalAccountPage = mainPage.clickPersonalAccountButton();
        MainPage mainPageAgain = personalAccountPage.clickLogoLink();
        Assert.assertTrue(mainPageAgain.shouldBeConstructBurgerText().contains("Соберите бургер"));

    }

    @Test
    public void testLogout(){

        MainPage mainPage = new MainPage(driver);
        PersonalAccountPage personalAccountPage = mainPage.clickPersonalAccountButton();
        LoginPage loginPage = personalAccountPage.logoutUser();
        Assert.assertTrue(loginPage.shouldBeLoginText().contains("Вход"));

    }
}
