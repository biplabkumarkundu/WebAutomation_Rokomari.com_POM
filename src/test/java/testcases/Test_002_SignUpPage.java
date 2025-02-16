package testcases;

import driverpackage.BaseDriver;
import io.qameta.allure.Description;
import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import models.Locators;
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
    Locators lc=new Locators();
    TakeScreenshot screenshot=new TakeScreenshot();

    @Test(description = "SignUp in Rokomari.com Test")
    @Description("Test Description: This test will try to Sign In for Rokomari.\n " + "It will verify every step and save screenshots for future use.")
    public void testSignUpPage()throws IOException {

//        signUpPage.signup(); //comment down due to OTP bypass
//        time.waitForPageLoad();
        signUpPage.loadAnWebPage("https://www.rokomari.com/my-section/profile");
        time.timeOut(2000);
        Assert.assertFalse(signUpPage.is_element_visible(lc.signInLoginButton));
        Assert.assertFalse(signUpPage.is_element_visible(lc.signInButton));
        screenshot.addScreenshot("Login Successful");
        signUpPage.loadAnWebPage(lc.homePageURL);
        time.timeOut(2000);
        //Assert.assertEquals(homePage.getElement(lc.welcomeToRokomari).getText(),lc.welcomeToRokomariText);
    }
}
