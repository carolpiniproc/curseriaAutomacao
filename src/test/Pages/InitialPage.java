import org.openqa.selenium.WebElement;
import java.util.List;

public class InitialPage {
    InicialMap inicialMap = new InicialMap();

//    String stTituloLivro = "//h2/a";
//    String stLivros = "ul.products-grid > li";
//    String stPrecoLista = "span.price";
//    String stTituloLivroLista = "h2 > a";

    public void setPesquisa(CharSequence... valor) {
        inicialMap.pesquisa.sendKeys(valor);
    }

    public String getTituloLivro() {
      //  WebElement elTitLivro = Driver.getDriver().findElement(By.xpath(stTituloLivro));
      //  String livro = elTitLivro.getText();
        String livro = inicialMap.tituloLivro.getText();
        return livro;
    }

    public String getPreco() {
        return inicialMap.preco.getText();
    }

    public String getPrecoLista() {
       // List<WebElement> livros = Driver.getDriver().findElements(By.cssSelector(stLivros));
        List<WebElement> livros = inicialMap.livros.getElements();
        for (WebElement livro : livros) {
            inicialMap.tituloLivroLista.setWebElement(livro);
            String titulo = inicialMap.tituloLivroLista.getText();
            if (titulo.contains("Ajax com Java")) {
                inicialMap.precoLista.setWebElement(livro);
                return inicialMap.precoLista.getText();
            }
        }
        return null;
    }

}