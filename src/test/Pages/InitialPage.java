import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class InitialPage {
    String stPesquisa = "search";
    String stTituloLivro = "//h2/a";
    String stPreco = "#product-price-44 > span";

    public void setPesquisa(CharSequence... valor){
        WebElement pesquisa = Driver.getDriver().findElement(By.id(stPesquisa));
        pesquisa.sendKeys(valor);
    }

    public String getTituloLivro(){
        WebElement elTitLivro = Driver.getDriver().findElement(By.xpath(stTituloLivro));
        String livro = elTitLivro.getText();
        return livro;
    }

    public String getPreco(){
        WebElement elPreco = Driver.getDriver().findElement(By.cssSelector(stPreco));
        return elPreco.getText();
    }


}
