import Settings.Driver;
import org.junit.Test;
import org.openqa.selenium.By;
import settings.BaseTest;

public class acessaInvestimentos extends BaseTest {

    InvestmntosPage investmntosPage = new InvestmntosPage();

    @Test
    public void insereConta() {
        Driver.setUrl("https://www.m2.prebanco.com.br/mobilev2/android/Login.do");
        investmntosPage.setAgencia("6505");
        investmntosPage.setConta("44377");
        investmntosPage.setSenha("1212");
        investmntosPage.clickOKButton();
    }

    @Test
    public void insereChave() {
        Driver.setUrl("https://www.m2.prebanco.com.br/mobilev2/android/Login.do");
        insereConta();
        String chave = Driver.getDriver().findElement(By.xpath("//label[2]")).getText();
        // String posicaoChave = "0"+chave.substring(17, 19).trim();
        String posicaoChave = "0"+chave.split(" ")[3];
        Driver.getDriver().findElement(By.id("chaveSeguranca")).sendKeys(posicaoChave);
        Driver.getDriver().findElement(By.id("OK")).click();
    }

}
