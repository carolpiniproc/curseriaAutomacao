import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverSettings {

    WebDriver driver;

    public void abreBrowser()
    {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://www.m2.prebanco.com.br/mobilev2/android/Login.do");
        driver.manage().window().maximize();
    }

    public void quitProcess()
    {
       driver.quit();
    }
}