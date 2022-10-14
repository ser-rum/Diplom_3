import PageObject.LoginPage;
import PageObject.MainPage;
import PageObject.PersonalAccountPage;
import org.junit.Assert;
import org.junit.Test;

public class PersonalAccountTest extends BaseForAccountTest {

    @Test
    public void testTransferToConstructor(){

        MainPage mainPageAgain = new PersonalAccountPage(driver).clickConstructorButton();
        Assert.assertTrue(mainPageAgain.shouldBeConstructBurgerText().contains("Соберите бургер"));

    }

    @Test
    public void testTransferByLogoLink(){

        MainPage mainPageAgain = new PersonalAccountPage(driver).clickLogoLink();
        Assert.assertTrue(mainPageAgain.shouldBeConstructBurgerText().contains("Соберите бургер"));

    }

    @Test
    public void testLogout(){

        LoginPage loginPage = new PersonalAccountPage(driver).logoutUser();
        Assert.assertTrue(loginPage.shouldBeLoginText().contains("Вход"));

    }
}
