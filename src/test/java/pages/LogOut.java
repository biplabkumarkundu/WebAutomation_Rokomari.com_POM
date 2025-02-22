package pages;

import io.qameta.allure.Step;
import models.CommonMethods;
import models.TimeOut;
import org.openqa.selenium.By;

public class LogOut extends CommonMethods {

    public By logInUserName= By.xpath("//span[@class='user-name']");
    public By signOut_btn=By.xpath("//a[normalize-space()='Sign Out']");

    TimeOut time=new TimeOut();

    // I didn't do logout beacause we use previous session for Login/OTP bypass issue
    // If i want to logout then login will not be available for future use

//    @Step("Click on username button and click on sign out button from drop-down")
//    public void clickSignOut(){
//        clickOnElement(logInUserName);
//        time.timeOut(1000);
//        clickOnElement(signOut_btn);
//        time.timeOut(3000);
//    }

}
