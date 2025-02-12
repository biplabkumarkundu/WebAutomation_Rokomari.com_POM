package testcases;

import dev.failsafe.Timeout;
import driverpackage.BaseDriver;
import models.Locators;
import models.TimeOut;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;

public class Test_001_HomePage extends BaseDriver {
    HomePage homePage = new HomePage();
   TimeOut time = new TimeOut();
    Locators lc = new Locators();

    @Test
    public void homePageTest() throws InterruptedException {
        homePage.loadAnWebPage(lc.pageURL);
        time.waitForPageLoad();
        Assert.assertEquals(homePage.getCurrentUrl(),lc.pageURL);
        Assert.assertEquals(homePage.pagetitle(),lc.pageTitle);
    }
}
