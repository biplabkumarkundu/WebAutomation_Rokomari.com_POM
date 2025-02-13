package testcases;

import driverpackage.BaseDriver;
import models.Locators;
import models.TimeOut;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignUpPage;

public class Test_002_SignUpPage extends BaseDriver {

    HomePage homePage=new HomePage();
    SignUpPage signUpPage=new SignUpPage();
    TimeOut time=new TimeOut();
    Locators lc=new Locators();
    @Test
    public void testSignUpPage(){
        signUpPage.goToSignInPage();
        time.timeOut(2000);
        time.waitForPageLoad();
        Assert.assertEquals(signUpPage.pageTitle(),lc.signInPageTitle);

        signUpPage.signup();
        time.timeOut(2000);
    }
}
