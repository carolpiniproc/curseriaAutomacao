import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;

public class SinglePageSteps{

    SinglePagePages spp = new SinglePagePages();
    @Then("valido que estou na single page do livro {string} com o preco {string}")
    public void valido_que_estou_na_single_page_do_livro_com_o_preco(String titulo, String preco) {
        assertEquals(titulo, spp.getTitulo());
        assertEquals(preco, spp.getPreco());
    }



}
