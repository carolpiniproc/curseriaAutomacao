import Settings.Driver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Keys;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class searchLivrosTest extends BaseTest{
    InitialPage initialPage = new InitialPage();

    @Test
    public void testAsserThat()  {
        Driver.setUrl("http://www.lojaexemplodelivros.com.br");
        initialPage.setPesquisa("fortaleza", Keys.ENTER);
        String livro = initialPage.getTituloLivro();
        Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
      //  Thread.currentThread().sleep(5000);
        String preco = initialPage.getPreco();
        assertThat("R$519,90", is(preco));
        assertThat("R$519,909",containsString(preco));
    }

    @Test
    public void testList() {
        Driver.setUrl("http://www.lojaexemplodelivros.com.br");
        initialPage.setPesquisa("html", Keys.ENTER);
        String preco = initialPage.getPrecoLista();
        assertThat("R$444,50", is(preco));
    }



//    public void testTrue(){
//        boolean x = false;
//        //   Assert.assertTrue(x);
//        Assert.assertEquals(false, x);
//    }
//
//
//    public void error () throws Exception {
//        throw new Exception("Erro no Unit Test");
//    }
}

