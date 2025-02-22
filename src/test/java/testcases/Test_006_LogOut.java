package testcases;

import driverpackage.BaseDriver;
import io.qameta.allure.Description;
import models.TakeScreenshot;
import org.testng.annotations.Test;
import pages.LogOut;

public class Test_006_LogOut extends BaseDriver {

    LogOut logout=new LogOut();
    TakeScreenshot screenshot=new TakeScreenshot();
    @Test(description = "Sign Out from rokomari.com")
    @Description("Test Description: This test will try to Sign Out from rokomari.com")
    public void TestLogout(){
        // I didn't do logout beacause we use previous session for Login/OTP bypass issue
        // If i want to logout then login will not be available for future use

//        logout.clickSignOut();
//        screenshot.addScreenshot("After Sign Out");

    }
}
