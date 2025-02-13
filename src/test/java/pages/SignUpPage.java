package pages;

import io.qameta.allure.Step;
import models.CommonMethods;
import models.Locators;
import models.TimeOut;

public class SignUpPage extends CommonMethods {

    Locators lc=new Locators();
    TimeOut time=new TimeOut();
    @Step("Hover and Click Sign In Button")
    public void goToSignInPage(){
        hover(lc.signInButton);
        clickOnElement(lc.signInButton);
    }

    @Step("Collect actual page title")
    public String pageTitle(){
        return getPageTitle();
    }

    @Step("Sign In with gmail and OTP")
    public void signup(){
        writeOnElement(lc.signInEmail,lc.signInEmailText);
        clickOnElement(lc.signInNext);
        time.timeOut(2000);
        writeOnElement(lc.signInOtp,lc.signInOtpText);
        clickOnElement(lc.signInLoginButton);
    }



}
