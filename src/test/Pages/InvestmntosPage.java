import Settings.Driver;
import org.openqa.selenium.By;

public class InvestmntosPage {

    String stAg = "agn";
    String stConta = "ctaDig";
    String stSenha = "senha";
    String stOkButton = "OK";

    public void setAgencia(CharSequence valor){
        Driver.getDriver().findElement(By.id(stAg)).sendKeys(valor);
    }

    public void setConta(CharSequence valor){
        Driver.getDriver().findElement(By.id(stConta)).sendKeys(valor);
    }

    public void setSenha(CharSequence valor){
        Driver.getDriver().findElement(By.id(stSenha)).sendKeys(valor);
    }

    public void clickOKButton(){
        Driver.getDriver().findElement(By.id(stOkButton)).click();
    }
}
