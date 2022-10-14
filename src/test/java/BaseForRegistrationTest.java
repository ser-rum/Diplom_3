import PageObject.LoginPage;
import PageObject.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static PageObject.BASE_URL.BASE_URL;

public class BaseForRegistrationTest {

    WebDriver driver;
    String email = "ser_rum@praktikum.ru";
    String password = "123123";


    @Before
    public void setup(){

//        WebDriverManager.firefoxdriver().setup();     //Раскомментировать для проверки на Firefox
//        driver = new FirefoxDriver();                 //Раскомментировать для проверки на Firefox
        WebDriverManager.chromedriver().setup();        //Закомментировать для проверки на Firefox
        driver = new ChromeDriver();                    //Закомментировать для проверки на Firefox
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(BASE_URL + "/register");

    }

    @After
    public void tearDown(){

        driver.quit();

    }
}
