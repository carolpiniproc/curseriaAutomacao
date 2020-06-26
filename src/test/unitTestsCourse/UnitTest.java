import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
    @Test
    public void clicaInvestimentos(){
        String icone = "Investimentos";
        Assert.assertEquals("Investimentos", icone);
    }

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
}
