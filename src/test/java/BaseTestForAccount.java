import PageObject.LoginPage;
import PageObject.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

import static PageObject.BASE_URL.BASE_URL;

@RunWith(Parameterized.class)
public class BaseTestForAccount {

    WebDriver driver;
    String email = "ser_rum@praktikum.ru";
    String password = "123123";

    private final String browser;

    public BaseTestForAccount(String browser) {
        this.browser = browser;
    }


    @Parameterized.Parameters
    public static Object[][] getBrowser(){
        return new Object[][]{
                {"Google Chrome"},
                {"Yandex Browser"}
        };
    }


    @Before
    public void setup(){

        switch (browser){
            case "Google Chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "Yandex Browser":
                WebDriverManager.chromedriver().driverVersion("104.0.5112.20").setup();
                //в setBinary - путь до бинарного файла Яндекс браузера
                ChromeOptions options = new ChromeOptions().setBinary("/usr/bin/yandex-browser");
                driver = new ChromeDriver(options);
                break;
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(BASE_URL);
        MainPage mainPage = new MainPage(driver);
        LoginPage loginPage = mainPage.clickLoginButton();
        MainPage mainPageAgain = loginPage.login(email, password);
        mainPageAgain.clickPersonalAccountButton();

    }

    @After
    public void tearDown(){

        driver.quit();

    }
}
