package models;

import driverpackage.PageDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static driverpackage.PageDriver.getCurrentDriver;
import static driverpackage.PageDriver.getDriver;

public class CommonMethods {
    public WebElement getElement(By locator){

        return getDriver().findElement(locator);
    }
    public String getAttributeValue(By locator, String attribute){

        return PageDriver.getCurrentDriver().findElement(locator).getAttribute(attribute);
    }
    public void clickOnElement(By locator){

        getElement(locator).click();
    }

    public void writeOnElement(By locator, String text){

        getElement(locator).sendKeys(text);
    }
    public void  selectOnElement(By locator,String value){
        WebElement selectElement=getElement(locator);
        Select select=new Select(selectElement);
        select.selectByVisibleText(value);
    }

    public void loadAnWebPage(String url){

        getDriver().get(url);
    }

    public String getPageTitle(){

        return getDriver().getTitle();
    }

    public String getLoadedPageUrl(){

        return getDriver().getCurrentUrl();
    }

    public Boolean is_element_visible(By locator){
        try {
            return getElement(locator).isDisplayed();
        }
        catch (Exception e){
            return false;
        }
    }
    public void clickOnAButtonJs(String script) {
        JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
        js.executeScript(script + ".click();");
    }
    public void hover(By element){
        WebElement btn= PageDriver.getCurrentDriver().findElement(element);
        Actions actions=new Actions(PageDriver.getCurrentDriver());
        actions.clickAndHold(btn).build().perform();

    }
    public String getText(By element) {
        return PageDriver.getCurrentDriver().findElement(element).getText();
    }
    public void highlighter(By element) {
        WebElement el = PageDriver.getCurrentDriver().findElement(element);
        JavascriptExecutor js = (JavascriptExecutor) PageDriver.getCurrentDriver();
        js.executeScript("arguments[0].setAttribute('style','border:2px solid red;background: beige');", el);

    }
    public void clickOnButton(By btn) {
        PageDriver.getCurrentDriver().findElement(btn).click();
    }

    public void scrollToElement(By element){
        WebElement btn = PageDriver.getCurrentDriver().findElement(element);
        Actions actions = new Actions(PageDriver.getCurrentDriver());
        actions.scrollToElement(btn).build().perform();
    }

    public void listitem(By element, String visibleText) {
        List<WebElement> listItems = PageDriver.getCurrentDriver().findElements(element);
        for (WebElement item : listItems) {
            if (item.getText().equals(visibleText)) {
                item.click();
                break;
            }
        }
    }
    public String currentlySelectedItem(By element){
        Select select=new Select(PageDriver.getCurrentDriver().findElement(element));
        return select.getFirstSelectedOption().getText();
    }
    public void switchToIframebyID(String frame_id){
        getCurrentDriver().switchTo().frame(frame_id);
    }
    public void switchToIframeByWebelement(By element){
        getCurrentDriver().switchTo().frame((WebElement) element);
    }

}
