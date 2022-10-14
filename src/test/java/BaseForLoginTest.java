import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BaseForLoginTest {

    WebDriver driver;

    @Before
    public void setup(){

//        WebDriverManager.firefoxdriver().setup();     //Раскомментировать для проверки на Firefox
//        driver = new FirefoxDriver();                 //Раскомментировать для проверки на Firefox
        WebDriverManager.chromedriver().setup();        //Закомментировать для проверки на Firefox
        driver = new ChromeDriver();                    //Закомментировать для проверки на Firefox
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown(){

//        driver.get(BASE_URL + "/account/profile");
//        PersonalAccountPage personalAccountPage = new PersonalAccountPage(driver);
//        personalAccountPage.logoutUser();
        driver.quit();

    }
}
