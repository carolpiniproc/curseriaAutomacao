package steps;

import Settings.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InitialSteps {

    @Given("que estou na tela inicial")
    public void queEstouNaTelaInicial() {
        Driver.setUrl();
    }

    @When("eu procuro pelo livro {string}")
    public void euProcuroPeloLivro(String titulo) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("valido o título {string}")
    public void validoOTítulo(String titulo) {
        throw new io.cucumber.java.PendingException();
    }
    @Then("o preco {string}")
    public void oPreco(String preco) {
        throw new io.cucumber.java.PendingException();
    }
    @When("clico no livro pesquisado")
    public void clicoNoLivroPesquisado() {
        throw new io.cucumber.java.PendingException();
    }
    @Then("valido que estou na single page do livro {string} com o preco {string}")
    public void validoQueEstouNaSinglePageDoLivroComOPreco(String titulo, String preco) {
        throw new io.cucumber.java.PendingException();
    }

}
