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
        Assert.assertEquals(shippingPage.fromIputFieldValue("Customer Name",shippingPage.customerName),shippingPage.customerName_text);
        Assert.assertEquals(shippingPage.fromIputFieldValue("Phone Number",shippingPage.phoneNumber),shippingPage.phoneNumber_text);
        //Assert.assertEquals(shippingPage.fromIputFieldValue("Alternative Phone Number",shippingPage.altPhoneNumber),shippingPage.altPhoneNumber_text);
        Assert.assertEquals(shippingPage.fromSelectField("Country Selected",shippingPage.selectCountry),shippingPage.selectCountry_text);
        Assert.assertFalse(shippingPage.fromSelectField("Country Not Selected",shippingPage.selectCountry).contains(shippingPage.countryNotSelected));
        Assert.assertEquals(shippingPage.fromSelectField("City",shippingPage.selectCity),shippingPage.selectCity_text);
        Assert.assertEquals(shippingPage.fromSelectField("Area",shippingPage.selectArea),shippingPage.selectArea_text);
        Assert.assertEquals(shippingPage.fromSelectField("Zone",shippingPage.selectZone),shippingPage.selectZone_text);
        screenshot.addScreenshot("Shipping page after provide requre information");

    }
}
