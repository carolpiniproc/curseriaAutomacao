import org.junit.Test;
import org.openqa.selenium.By;

public class insereConta extends driverSettings{
    @Test
    public void insereConta(){
        abreBrowser();
        driver.findElement(By.id("agn")).sendKeys("6505");
        driver.findElement(By.id("ctaDig")).sendKeys("44377");
        driver.findElement(By.id("senha")).sendKeys("1212");
        driver.findElement(By.id("OK")).click();
        quitProcess();
    }
}
