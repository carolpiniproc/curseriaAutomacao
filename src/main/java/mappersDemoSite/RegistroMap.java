package mappersDemoSite;

import Settings.ByValue;
import Settings.Element;

public class RegistroMap {

    public Element name = new Element(ByValue.CSS,"input[ng-model=\"FirstName\"]");
    public Element lastName = new Element(ByValue.CSS,"input[ng-model=\"LastName\"]");
    public Element address = new Element(ByValue.CSS,"input[ng-model=\"Adress\"]");
    public Element email = new Element(ByValue.CSS,"input[ng-model=\"EmailAdress\"]");
    public Element phone = new Element(ByValue.CSS,"input[ng-model=\"Phone\"]");
    public Element male = new Element(ByValue.CSS,"input[value=\"Male\"]");
    public Element female = new Element(ByValue.CSS,"input[value=\"FeMale\"]");
    public Element cricket = new Element(ByValue.ID,"#checkbox1");
    public Element movies = new Element(ByValue.ID,"#checkbox2");
    public Element hockey = new Element(ByValue.ID,"#checkbox3");
    public Element languageList = new Element(ByValue.ID,"#msdd");
    public Element language = new Element(ByValue.CSS,"#msdd div, a.ui-corner-all");
    public Element skillsList = new Element(ByValue.ID,"#Skills");
    public Element countryList = new Element(ByValue.ID,"#countries");
    public Element countrySearchList = new Element(ByValue.ID,"country");
    public Element countrySearchType = new Element(ByValue.CSS,"input[type=\"search\"]");
    public Element year = new Element(ByValue.ID,"yearbox");
    public Element month = new Element(ByValue.CSS,"select[ng-model=\"monthbox\"]");
    public Element day = new Element(ByValue.ID,"daybox");
    public Element password = new Element(ByValue.ID,"firstpassword");
    public Element confirmPassword = new Element(ByValue.ID,"secondpassword");
    public Element submit = new Element(ByValue.ID,"submitbtn");
    public Element refresh = new Element(ByValue.ID,"Button1");
    public Element uploadArquivo = new Element(ByValue.ID,"imagesrc");
}
