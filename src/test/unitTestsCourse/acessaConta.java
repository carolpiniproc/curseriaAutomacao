import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class acessaConta extends driverSettings{
w
    @Test
    public void insereConta(){
        driver.findElement(By.id("agn")).sendKeys("6505");
        driver.findElement(By.id("ctaDig")).sendKeys("44377");
        WebElement senha = driver.findElement(By.id("senha"));
        senha.sendKeys("1212");
        driver.findElement(By.id("OK")).sendKeys(Keys.ENTER);
    }

    @Test
    public void insereChave(){
        insereConta();
        String chave = driver.findElement(By.xpath("//label[2]")).getText();
        driver.findElement(By.id("chaveSeguranca")).sendKeys(chave);
        driver.findElement(By.id("OK")).click();
    }

}
