package testcases;

import driverpackage.BaseDriver;
import io.qameta.allure.Description;
import models.TakeScreenshot;
import models.TimeOut;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ProductsPage;

public class Test_003_SelectProduct extends BaseDriver {

    ProductsPage productsPage=new ProductsPage();
    TimeOut time=new TimeOut();
    TakeScreenshot screenshot=new TakeScreenshot();

    @Test(description = "Select a book by filtering writer and category")
    @Description("Test Description: This test will try to select a specific writer then perform "
            + "filtering based on two categories. after that, "
            + "it browses to the next page and adds the fourth book to the cart")
    public void testSelectProduct(){

        productsPage.closePopupBannaer();
        productsPage.selectWriter();
        time.waitForPageLoad();
        Assert.assertEquals(productsPage.getPageTitle(),productsPage.productPageTitle);
        screenshot.addScreenshot("Writer Book Collection");
        productsPage.filterCategory();

        screenshot.addScreenshot("Writer Book Collection After Filter");
        productsPage.scrollAndGoToNextPage();
        Assert.assertEquals(productsPage.getElement(productsPage.currentpageNumber).getText(),"2");
        screenshot.addScreenshot("Writer Book Collection 2nd page with filter");
        productsPage.selcetBookandAddtoCart();
        screenshot.addScreenshot("Product Page after a book added in cart");
    }
}
