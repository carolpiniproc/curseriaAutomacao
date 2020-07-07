import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import java.util.List;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

public class UnitTest extends driverSettings{
    @Test
    public void testTrue(){
        boolean x = false;
     //   Assert.assertTrue(x);
        Assert.assertEquals(false, x);
    }

    @Test
    public void error () throws Exception {
        throw new Exception("Erro no Unit Test");
    }

    @Test
    public void testAsserThat()  {
        WebElement pesquisa = driver.findElement(By.id("search"));
        pesquisa.sendKeys("fortaleza", Keys.ENTER);
        WebElement elTitLivro = driver.findElement(By.xpath("//h2/a"));
        String livro = elTitLivro.getText();
        Assert.assertEquals("[PRODUTO DE EXEMPLO] - Fortaleza Digital", livro);
      //  Thread.currentThread().sleep(5000);
        WebElement elPreco = driver.findElement(By.cssSelector("#product-price-44 > span"));
        String preco = elPreco.getText();
        assertThat("R$519,90", is(preco));
        assertThat("R$519,909",containsString(preco));
    }

    @Test
    public void testList() {
        driver.findElement(By.id("search")).sendKeys("html", Keys.ENTER);
        List<WebElement> elLivros = driver.findElements(By.cssSelector("ul.products-grid > li"));
        for (WebElement elLivro: elLivros) {
            WebElement elTitLivro = elLivro.findElement(By.cssSelector("h2 > a"));
            String titLivro = elTitLivro.getText();
            if (titLivro.contains("Ajax com Java")){
                String elPreco = elLivro.findElement(By.cssSelector("span.price")).getText();
                assertThat("R$444,50", is(elPreco));
            }

        }

    }
}

