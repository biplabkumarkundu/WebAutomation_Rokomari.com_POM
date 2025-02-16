package pages;

import io.qameta.allure.Step;
import models.CommonMethods;
import models.Locators;
import models.TimeOut;

public class SignUpPage extends CommonMethods {

    Locators lc=new Locators();
    TimeOut time=new TimeOut();

//    @Step("Sign In with gmail and OTP")
//    public void signup(){
//     loadAnWebPage("https://www.rokomari.com/login");
//        writeOnElement(lc.signInEmail,lc.signInEmailText); //Beacuse we use previous session for login
//        clickOnElement(lc.signInNext);
//        time.timeOut(15000);
//    }
    @Step("My Profile Section")
    public void  myProfileSection(){
       loadAnWebPage(lc.profilepage);
    }
    @Step("Collect Username or email after Login")
    public String userName(){
        return getText(lc.signInEmail);
    }
    @Step("Highlight user name after successful sign-up")
    public void userNameHighlight() {
        highlighter(lc.loginName);
    }





}
