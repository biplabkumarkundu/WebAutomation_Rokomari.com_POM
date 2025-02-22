package pages;

import io.qameta.allure.Step;
import models.CommonMethods;
import models.TakeScreenshot;
import models.TimeOut;
import org.openqa.selenium.By;

public class ShippingPage extends CommonMethods {

    //Shipping Page Locators
    public String shippingPageTitle="Shipping Address | Rokomari.com";
    public String shipppingPageUrl="https://www.rokomari.com/shipping";
    public String customerName_text="Biplab";
    public String phoneNumber_text="01825458568";
    public String altPhoneNumber_text="01721126993";
    public String selectCountry_text="Bangladesh";
    public String countryNotSelected="Germany";
    public String selectCity_text="খাগড়াছড়ি";
    public String selectArea_text="দীঘিনালা";
    public String selectZone_text="বাবুছড়া ইউনিয়ন";
    public String customerAddress_text="House 49, Road 15, BabuChora Union";

    public By pickUpAddress= By.xpath("//div[@class='card-body special-shipping js--special-shipping']//div//label[contains(text(),'Home')]");
    public By customerName=By.xpath("//div[@class='shipping-form-container']//input[@id='name']");
    public By phoneNumber=By.xpath("//fieldset[@class='group']//input[@id='phone']");
    public By altPhoneNumber=By.xpath("//input[@class='js--alternative-phone']");
    public By selectCountry=By.cssSelector("#js--country");
    public By selectCity=By.cssSelector("#js--city");
    public By selectArea=By.cssSelector("#js--area");
    public By selectZone=By.cssSelector("#js--zone");
    public By customerAddress=By.xpath("//div[@class='shipping-form-container']//textarea[@id='address']");
    public By paymentCOD=By.xpath("//label[@for='COD']");
    public By scrollForVisibility=By.xpath("//label[contains(text(),'রকমারির শর্তাবলীতে সম্মতি প্রদান করছি ৷')]");

    TakeScreenshot screenshot=new TakeScreenshot();
    MyCartPage myCartPage=new MyCartPage();
    TimeOut time=new TimeOut();

    @Step("Click on Proceed to checkout and wait for complete page load")
    public void goToShippingPage(){
        clickOnElement(myCartPage.proceedToCheckout);
        time.waitForPageLoad();
    }

    @Step("Collect Actual Page title")
    public String currentPageTitle(){
        return getPageTitle();
    }
    @Step("Collect actual page Url")
    public String currenPagetUrl(){
        return getLoadedPageUrl();
    }

    @Step("Fill up the delivery information form with book recipient information")
    public void fillUpForm(){
        writeOnElement(customerName,customerName_text);
        writeOnElement(phoneNumber,phoneNumber_text);
        writeOnElement(altPhoneNumber,altPhoneNumber_text);
        time.timeOut();
        clickOnElement(selectCountry);
        selectOnElement(selectCountry,selectCountry_text);
        time.timeOut();
        clickOnElement(selectCity);
        selectOnElement(selectCity,selectCity_text);
        time.timeOut();
        clickOnElement(selectArea);
        selectOnElement(selectArea,selectArea_text);
        time.timeOut();
        clickOnElement(selectZone);
        selectOnElement(selectZone,selectZone_text);
        time.timeOut();
        writeOnElement(customerAddress,customerAddress_text);
        time.timeOut();
        screenshot.addScreenshot("Screenshot After porviding information");
        scrollToElement(scrollForVisibility);
        clickOnElement(paymentCOD);
        time.timeOut();

    }

    @Step("")
    public String  fromIputFieldValue(String name,By element){
        return getAttributeValue(element,"value");
    }
    @Step("")
    public String fromSelectField(String fieldname,By element){
        return currentlySelectedItem(element);
    }


}
