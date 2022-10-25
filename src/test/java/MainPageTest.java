import PageObject.MainPage;
import PageObject.PersonalAccountPage;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Assert;
import org.junit.Test;

public class MainPageTest extends BaseTestForMain {

    public MainPageTest(String browser) {
        super(browser);
    }

    @Test
    @DisplayName("Проверка перехода в личный кабинет")
    public void testTransferToPersonalAccount(){

        MainPage mainPage = new MainPage(driver);
        PersonalAccountPage personalAccountPage = mainPage.clickPersonalAccountButton();
        Assert.assertTrue(personalAccountPage.shouldBePersonalAccountText().contains(
                "В этом разделе вы можете изменить свои персональные данные"));

    }

    @Test
    @DisplayName("Проверка перехода к области выбора начинок")
    public void testTransferToFillingChapter(){

        MainPage mainPage = new MainPage(driver);
        mainPage.clickFillingButton();
        Assert.assertTrue(mainPage.shouldBeFillingText().contains("Начинки"));

    }

    @Test
    @DisplayName("Проверка перехода к области выбора соусов")
    public void testTransferToSauceChapter(){

        MainPage mainPage = new MainPage(driver);
        mainPage.clickSauceButton();
        Assert.assertTrue(mainPage.shouldBeSauceText().contains("Соусы"));

    }

    @Test
    @DisplayName("Проверка перехода к области выбора булок")
    public void testTransferToBunChapter(){

        MainPage mainPage = new MainPage(driver);
        mainPage.clickFillingButton();
        mainPage.clickBunButton();
        Assert.assertTrue(mainPage.shouldBeBunText().contains("Булки"));

    }
}