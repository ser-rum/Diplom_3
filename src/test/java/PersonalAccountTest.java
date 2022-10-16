import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.PersonalAccountPage;
import org.junit.Assert;
import org.junit.Test;

public class PersonalAccountTest extends BaseTestForAccount {

    public PersonalAccountTest(String browser) {
        super(browser);
    }

    @Test
    public void testTransferToConstructor(){

        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        MainPage mainPageAgain = personalAccountPage.clickConstructorButton();
        Assert.assertEquals("Соберите бургер", mainPageAgain.shouldBeConstructBurgerText());

    }

    @Test
    public void testTransferByLogoLink(){

        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        MainPage mainPageAgain = personalAccountPage.clickLogoLink();
        Assert.assertEquals("Соберите бургер", mainPageAgain.shouldBeConstructBurgerText());

    }

    @Test
    public void testLogout(){

        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
        LoginPage loginPage = personalAccountPage.logoutUser();
        Assert.assertEquals("Вход", loginPage.shouldBeLoginText());

    }
}
