import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSettings {

    WebDriver driver;

    @Before
    public void abreBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.m2.prebanco.com.br/mobilev2/android/Login.do");
        Dimension d = new Dimension(400,800);
        driver.manage().window().setSize(d);
        //driver.manage().window().maximize();
    }

    @After
    public void quitProcess()
    {
       driver.quit();
    }
}