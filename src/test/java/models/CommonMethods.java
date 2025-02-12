package models;

import driverpackage.PageDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

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

//    public void addScreenshot(String name){
//        Allure.addAttachment(name, new ByteArrayInputStream (((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.BYTES)));
//    }
}
