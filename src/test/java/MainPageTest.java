import PageObject.MainPage;
import PageObject.PersonalAccountPage;
import org.junit.Assert;
import org.junit.Test;

public class MainPageTest extends BaseForMainTest {

    @Test
    public void testTransferToPersonalAccount(){

        MainPage mainPage = new MainPage(driver);
        PersonalAccountPage personalAccountPage = mainPage.clickPersonalAccountButton();
        Assert.assertTrue(personalAccountPage.shouldBePersonalAccountText().contains(
                "В этом разделе вы можете изменить свои персональные данные"));

    }

    @Test
    public void testTransferToFillingChapter(){

        MainPage mainPage = new MainPage(driver);
        mainPage.clickFillingButton();
        Assert.assertTrue(mainPage.shouldBeFillingText().contains("Начинки"));

    }

    @Test
    public void testTransferToSauceChapter(){

        MainPage mainPage = new MainPage(driver);
        mainPage.clickSauceButton();
        Assert.assertTrue(mainPage.shouldBeSauceText().contains("Соусы"));

    }

    @Test
    public void testTransferToBunChapter(){

        MainPage mainPage = new MainPage(driver);
        mainPage.clickFillingButton();
        mainPage.clickBunButton();
        Assert.assertTrue(mainPage.shouldBeBunText().contains("Булки"));

    }
}


//    String userFirstName = "Евгений";
//    String userLastName = "Метила";
//    String userAddress = "ул. Ленина";
//    String userPhoneNumber = "89101234567";
//    String userDeliveryDay = "01.01.2023";
//    String placedOrderMessage = "Заказ оформлен";
//
//
//
//    @Test
//    public void testOrderScooterByTopButton() {
//
//        MainPage mainPage = new MainPage(driver);
//        FirstOrderPage firstOrderPage = mainPage.clickTopOrderButton();
//        SecondOrderPage secondOrderPage = firstOrderPage.feelFirstOrderPage(userFirstName, userLastName,
//                userAddress, userPhoneNumber);
//        OrderConfirmationPage orderConfirmationPage = secondOrderPage.feelSecondOrderPage(userDeliveryDay);
//        PlacedOrderPage placedOrderPage = orderConfirmationPage.clickConfirmationButton();
//        Assert.assertTrue(placedOrderPage.shouldBePlacedOrderText().contains(placedOrderMessage));
//
//    }
//
//    @Test
//    public void testOrderScooterByBottomButton(){
//
//        MainPage mainPage = new MainPage(driver);
//        FirstOrderPage firstOrderPage = mainPage.clickBottomOrderButton();
//        SecondOrderPage secondOrderPage = firstOrderPage.feelFirstOrderPage(userFirstName, userLastName,
//                userAddress, userPhoneNumber);
//        OrderConfirmationPage orderConfirmationPage = secondOrderPage.feelSecondOrderPage(userDeliveryDay);
//        PlacedOrderPage placedOrderPage = orderConfirmationPage.clickConfirmationButton();
//        Assert.assertTrue(placedOrderPage.shouldBePlacedOrderText().contains(placedOrderMessage));
//
//    }