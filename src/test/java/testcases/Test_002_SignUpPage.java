package testcases;

import driverpackage.BaseDriver;
import io.qameta.allure.Description;
import models.TakeScreenshot;
import models.TimeOut;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

import java.io.IOException;

public class Test_002_SignUpPage extends BaseDriver {

    HomePage homePage=new HomePage();
    SignUpPage signUpPage=new SignUpPage();
    TimeOut time=new TimeOut();

    TakeScreenshot screenshot=new TakeScreenshot();

    @Test(description = "SignUp in Rokomari.com Test")
    @Description("Test Description: This test will try to Sign In for Rokomari."
            + "It will verify every step and save screenshots for future use.")
    public void testSignUpPage()throws IOException {

//        signUpPage.signup(); //comment down due to OTP bypass
//        time.waitForPageLoad();
        signUpPage.loadAnWebPage("https://www.rokomari.com/my-section/profile");
        time.timeOut(2000);
        Assert.assertFalse(signUpPage.is_element_visible(signUpPage.signInLoginButton));
        Assert.assertFalse(signUpPage.is_element_visible(signUpPage.signInButton));
        Assert.assertTrue((signUpPage.is_element_visible(signUpPage.signInmyAccountButton)));
        screenshot.addScreenshot("Login Successful");
        signUpPage.loadAnWebPage(homePage.homePageURL);
        time.timeOut(2000);
        Assert.assertEquals(homePage.getPageTitle(),homePage.homePageTitle);
    }
}
