import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Element {
    ByValue by; //comando do selenium
    String map; //caminhos dos elementos
    String list;
    WebElement webElement = null;

    public Element(ByValue by, String _map){
        this.by = by;
        map = _map;
    }

    public void setWebElement(WebElement _element){
        webElement = _element;
    }

    public WebElement getWebElement(By by) {
        if (webElement == null){
           return Driver.getDriver().findElement(by);
        }else{
           return webElement.findElement(by);
        }
    }

    public WebElement getElement(){
        WebElement element = null;
        switch (by){
            case ID:
                element = getWebElement(By.id(map));
                break;
            case XPATH:
                element = getWebElement(By.xpath(map));
                break;
            case CSS:
                element = getWebElement(By.cssSelector(map));
                break;
            case LINKTEXT:
                element = getWebElement(By.linkText(map));
                break;
            case NAME:
                element = getWebElement(By.name(map));
                break;
            default:
                break;
        }
        return element;
    }

    public List<WebElement> getElements(){
        List<WebElement> elements = null;
        switch (by){
            case ID:
                elements = Driver.getDriver().findElements(By.id(map));
                break;
            case XPATH:
                elements = Driver.getDriver().findElements(By.xpath(map));
                break;
            case CSS:
                elements = Driver.getDriver().findElements(By.cssSelector(map));
                break;
            case LINKTEXT:
                elements = Driver.getDriver().findElements(By.linkText(map));
                break;
            case NAME:
                elements = Driver.getDriver().findElements(By.name(map));
                break;
            default:
                break;
        }
        return elements;
    }
    public void sendKeys(CharSequence... value){
        getElement().sendKeys(value);
    }

    public String getText() {
        return getElement().getText();
    }

    public void click(){
        getElement().click();
    }

    public String getAttribute(String value){
       return getElement().getAttribute(value);
    }
    public void clear(){
        getElement().clear();
    }
    public boolean isEnable(){
        return getElement().isEnabled();
    }
    public boolean isDisable(){
        return getElement().isDisplayed();
    }
    public boolean isSelected(){
        return getElement().isSelected();
    }

    public void select(String value){
        Select select = new Select(getElement());
        select.selectByVisibleText(value);
    }


}
