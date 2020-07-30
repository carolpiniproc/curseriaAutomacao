import Settings.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BaseSteps {

    @Before
    public void abreBrowser(){
        Driver.abreBrowser();
    }

    @After
    public void fechaBrowser(){
        Driver.quitProcess();
    }

}
