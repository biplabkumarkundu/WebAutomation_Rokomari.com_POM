package testcases;

import driverpackage.BaseDriver;
import io.qameta.allure.Description;
import models.TakeScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ShippingPage;

public class Test_005_ShippingPage extends BaseDriver {

    ShippingPage shippingPage=new ShippingPage();
    TakeScreenshot screenshot=new TakeScreenshot();

    @Test(description = "Shipping page test")
    @Description("Test Description: This test will try to browse to my shipping page then fill up "
            + "the delivery information form with book recipient info ")
    public void testShippingPage(){
        shippingPage.goToShippingPage();
        Assert.assertEquals(shippingPage.currentPageTitle(),shippingPage.shippingPageTitle);
        Assert.assertTrue(shippingPage.currenPagetUrl().contains(shippingPage.shipppingPageUrl));
        screenshot.addScreenshot("Shipping Page");
        shippingPage.fillUpForm();
        Assert.assertEquals(shippingPage.getElement(shippingPage.customerName).getText(),shippingPage.customerName_text);
        Assert.assertEquals(shippingPage.getElement(shippingPage.phoneNumber).getText(),shippingPage.phoneNumber_text);


    }
}
