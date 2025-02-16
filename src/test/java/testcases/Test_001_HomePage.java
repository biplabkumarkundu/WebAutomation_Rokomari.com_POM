package testcases;

import driverpackage.BaseDriver;
import io.qameta.allure.Description;
import models.Locators;
import models.TakeScreenshot;
import models.TimeOut;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

import java.io.IOException;

public class Test_001_HomePage extends BaseDriver {
    HomePage homePage = new HomePage();
   TimeOut time = new TimeOut();
    Locators lc = new Locators();
TakeScreenshot screenshot=new TakeScreenshot();

    @Test(description = "Open Rokomari.com Website and perform Testing")
    @Description("Test Description: Tins test will wait to completely load the home page of Rokomari\n" + "Then perform testing & take a screenshot.")
    public void homePageTest() {
        homePage.loadAnWebPage(lc.homePageURL);
        time.waitForPageLoad();
        Assert.assertEquals(homePage.getCurrentUrl(),lc.homePageURL);
        time.timeOut();
        Assert.assertEquals(homePage.pagetitle(),lc.homePageTitle);
        time.timeOut();
        screenshot.addScreenshot("Homepage");
        homePage.closePopupBannaer();
        screenshot.addScreenshot("Homepage After closing Popup");

    }
}
