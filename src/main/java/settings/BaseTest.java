package settings;

import Settings.Driver;
import org.junit.After;
import org.junit.Before;

public class BaseTest {

    @Before
    public void abreBrowser()
    {
        Driver.abreBrowser();
        // Driver.setDimension(480 , 600);
    }

    @After
    public void fechaNavegador(){
        Driver.quitProcess();
    }
}
