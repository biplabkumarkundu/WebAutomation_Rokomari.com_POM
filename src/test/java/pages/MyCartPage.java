package pages;

import io.qameta.allure.Step;
import models.CommonMethods;
import models.TimeOut;
import org.openqa.selenium.By;

public class MyCartPage extends CommonMethods {

    public String myCartPageTitle="My Cart | Rokomari.com";
    public String myCartPageUrl="https://www.rokomari.com/cart";

    public By clickToMyCart=By.xpath("//a[@id='js-cart-menu']");
    public By proceedToCheckout=By.xpath("//span[normalize-space()='Proceed to Checkout']");


    TimeOut time=new TimeOut();
    @Step("Click on My cart Button")
    public void clickMyCartPage(){
        clickOnElement(clickToMyCart);
        time.waitForPageLoad();
    }

    @Step("Collect actual page title")
    public String currentPageTitle(){
        return getPageTitle();
    }
    @Step("Collect actual page Url")
    public String currentPageUrl(){
        return getLoadedPageUrl();
    }
    @Step("Switching to Iframe")
    public void switchToIframe(){
       switchToIframebyID("jam-iframe-override");
    }
}
