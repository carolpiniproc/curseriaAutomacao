package steps;
import Settings.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import static org.junit.Assert.assertEquals;

public class InicialStep {
    pages.InitialPage initialPage = new pages.InitialPage();

    @Given("que estou na tela inicial")
    public void queEstouNaTelaInicial() {
        Driver.setUrl("http://www.lojaexemplodelivros.com.br");
    }
    @When("eu procuro pelo livro {string}")
    public void euProcuroPeloLivro(String titulo) {
        initialPage.setPesquisa(titulo, Keys.ENTER);
    }
    @Then("valido o título {string}")
    public void validoOTítulo(String titulo) {
        assertEquals(titulo,initialPage.getTituloLivro());
    }
    @Then("o preco {string}")
    public void oPreco(String preco) {
        assertEquals(preco, initialPage.getPreco());
    }
    @When("clico no livro pesquisado")
    public void clicoNoLivroPesquisado() {
        initialPage.clickTitulo();
    }
}