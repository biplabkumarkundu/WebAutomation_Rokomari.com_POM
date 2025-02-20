package testcases;

import driverpackage.BaseDriver;
import io.qameta.allure.Description;
import models.TakeScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.MyCartPage;

public class Test_004_MyCartPage extends BaseDriver {

    MyCartPage myCartPage=new MyCartPage();
    TakeScreenshot screenshot=new TakeScreenshot();

    @Test(description = "My cart page Test")
    @Description("Test Description: This test will try to browse to my cart page and perform tests")
    public void TestMyCartPage(){
        myCartPage.clickMyCartPage();
        Assert.assertEquals(myCartPage.currentPageTitle(),myCartPage.myCartPageTitle);
        Assert.assertEquals(myCartPage.currentPageUrl(),myCartPage.myCartPageUrl);
        Assert.assertTrue(myCartPage.is_element_visible(myCartPage.proceedToCheckout));
        screenshot.addScreenshot("My Cart After Adding book");


    }
}
