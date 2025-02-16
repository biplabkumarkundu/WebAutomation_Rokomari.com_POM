package testcases;

import driverpackage.BaseDriver;
import models.Locators;
import models.TakeScreenshot;
import models.TimeOut;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.helpers.AttributesImpl;
import pages.ProductsPage;

public class Test_003_SelectProduct extends BaseDriver {

    Locators lc=new Locators();
    ProductsPage productsPage=new ProductsPage();
    TimeOut time=new TimeOut();
    TakeScreenshot screenshot=new TakeScreenshot();

    @Test
    public void testSelectProduct(){

        productsPage.selectWriter();
        time.waitForPageLoad();
        Assert.assertEquals(productsPage.getPageTitle(),lc.productPageTitle);
        screenshot.addScreenshot("Writer Book Collection");
        productsPage.filterCategory();
        screenshot.addScreenshot("Writer Book Collection After Filter");
//        productsPage.clickOnElement(lc.categoryRochonaSomogro);
//        productsPage.scrollToElement(lc.nextPageIcon);
//        productsPage.clickOnElement(lc.nextPageIcon);
    }
}
