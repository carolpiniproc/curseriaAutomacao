import Settings.Driver;
import org.junit.Assert;
import org.junit.Test;

public class RegistroDemoSiteTest extends BaseTest{
    RegistroPage registroPage = new RegistroPage();

    @Test
    public void testRegistrar() throws InterruptedException {
        Driver.setUrl("http://demo.automationtesting.in/Register.html");
        registroPage.setName("Carol");
        registroPage.setLastName("Proc");
        registroPage.setAddress("Rua Hermantino Coelho 743");
        registroPage.setEmail("test@test.com");
        registroPage.setPhone("1135009876");
        registroPage.setGenderRadioButton("FeMale");
        registroPage.setHobbiesCheckbox("Movies");
        registroPage.setLanguageList("Filipino");
        registroPage.setLanguageList("English");
        registroPage.setSkillsList("Android");
        registroPage.setCountryList("Afghanistan");
        registroPage.setCountrySearchList("Denmark");
        registroPage.setDate("1986","July","4");
        registroPage.setPassword("123Mudar");
        registroPage.submit();
        Thread.sleep(4000);
        Assert.assertTrue(registroPage.checkNewRegister());
    }

//    @Test
//    public void testRefresh() throws InterruptedException {
//        testRegistrar();
//        registroPage.refresh();
//    }

}
