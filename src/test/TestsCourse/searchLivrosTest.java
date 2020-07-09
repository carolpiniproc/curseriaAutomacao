import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.containsString;

public class searchLivrosTest extends BaseTest{
    InitialPage initialPage = new InitialPage();

    @Test
    public void testAsserThat()  {
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
        initialPage.setPesquisa("html", Keys.ENTER);
        List<WebElement> elLivros = Driver.getDriver().findElements(By.cssSelector("ul.products-grid > li"));
        for (WebElement elLivro: elLivros) {
            String livro = initialPage.getTituloLivro();
            if (livro.contains("Ajax com Java")){
                String preco = initialPage.getPreco();
                assertThat("R$444,50", is(preco));
            }

        }

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

