package models;

import driverpackage.PageDriver;
import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.ByteArrayInputStream;
import java.util.List;

import static driverpackage.PageDriver.getCurrentDriver;
import static driverpackage.PageDriver.getDriver;

public class CommonMethods {
    public WebElement getElement(By locator){

        return getDriver().findElement(locator);
    }
    public void getAttribute(By locator,String value){

        getElement(locator).getAttribute(value);
    }
    public void clickOnElement(By locator){

        getElement(locator).click();
    }

    public void writeOnElement(By locator, String text){

        getElement(locator).sendKeys(text);
    }
    public void  selectOnElement(By locator,String value){
        getElement(locator).click();
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

    public void loadAWebPage(String url){

        getDriver().get(url);
    }
    public String getLoadedPageUrl(){

        return getDriver().getCurrentUrl();
    }

    public String getLoadedPageTitle(){

        return getDriver().getTitle();
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
        // WebElement el = (WebElement)(js.executeScript("return "+ script));
        // js.executeScript("arguments[0].click();" ,el);
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

}
