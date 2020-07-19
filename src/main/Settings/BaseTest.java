import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void abreBrowserLivros()
    {
        Driver.abreBrowser();
    }

    @After
    public void fechaNavegador(){
        Driver.quitProcess();
    }

  //  @Before
    public void abreBrowserBradesco()
    {
        Driver.abreBrowser();
        Driver.setDimension(480 , 600);
    }
}
