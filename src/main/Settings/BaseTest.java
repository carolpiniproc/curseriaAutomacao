import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void abreBrowserLivros()
    {
        Driver.abreBrowser("http://www.lojaexemplodelivros.com.br");
    }

    @After
    public void fechaNavegador(){
        Driver.quitProcess();
    }

  //  @Before
    public void abreBrowserBradesco()
    {
        Driver.abreBrowser("https://www.m2.prebanco.com.br/mobilev2/android/Login.do");
        Driver.setDimension(480 , 600);
    }
}
