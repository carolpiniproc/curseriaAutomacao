import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class InitialPage {
    InicialMap map = new InicialMap();

   // String stTituloLivro = "//h2/a";
    String stLivros = "ul.products-grid > li";
    String stPrecoLista = "span.price";
    String stTituloLivroLista = "h2 > a";

    public void setPesquisa(CharSequence... valor) {
        map.pesquisa.sendKeys(valor);
    }

    public String getTituloLivro() {
      //  WebElement elTitLivro = Driver.getDriver().findElement(By.xpath(stTituloLivro));
      //  String livro = elTitLivro.getText();
        String livro = map.tituloLivro.getText();
        return livro;
    }

    public String getPreco() {
        return map.preco.getText();
    }

    public String getPrecoLista() {
        List<WebElement> livros = Driver.getDriver().findElements(By.cssSelector(stLivros));
        for (WebElement livro : livros) {
            WebElement tituloLivro = livro.findElement(By.cssSelector(stTituloLivroLista));
            String titulo = tituloLivro.getText();
            if (titulo.contains("Ajax com Java")) {
                WebElement preco = livro.findElement(By.cssSelector(stPrecoLista));
                return preco.getText();
            }
        }
        return null;
    }

}