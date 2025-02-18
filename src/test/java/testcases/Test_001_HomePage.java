package testcases;

import driverpackage.BaseDriver;
import io.qameta.allure.Description;
import models.TakeScreenshot;
import models.TimeOut;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class Test_001_HomePage extends BaseDriver {
    HomePage homePage = new HomePage();
   TimeOut time = new TimeOut();
TakeScreenshot screenshot=new TakeScreenshot();

    @Test(description = "Open Rokomari.com Website and perform Testing")
    @Description("Test Description: Tins test will wait to completely load the home page of Rokomari"
            + "Then perform testing & take a screenshot.")
    public void homePageTest() {
        homePage.loadAnWebPage(homePage.homePageURL);
        time.waitForPageLoad();
        Assert.assertEquals(homePage.getCurrentUrl(),homePage.homePageURL);
        time.timeOut();
        Assert.assertEquals(homePage.pagetitle(),homePage.homePageTitle);
        time.timeOut();
        screenshot.addScreenshot("Homepage");
        homePage.closePopupBannaer();
        screenshot.addScreenshot("Homepage After closing Popup");

    }
}
