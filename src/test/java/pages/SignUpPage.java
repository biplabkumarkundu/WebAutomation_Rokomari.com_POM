package pages;

import io.qameta.allure.Step;
import models.CommonMethods;
import models.TimeOut;
import org.openqa.selenium.By;

public class SignUpPage extends CommonMethods {
    public String signInPageTitle="Login To Rokomari | Rokomari.com";

    public String signInEmailText="decivi1738@jarars.com";
    public String signInOtpText="3730";
    public String welcomeToRokomariText="Welcome to Rokomari.com!";

    public By myAccountButton=By.xpath("//a[normalize-space()='My Account']");
    public String profilepage="https://www.rokomari.com/my-section";
    public By signInButton=By.xpath("//a[normalize-space()='Sign In']");

    public By signInEmail=By.xpath("//input[@placeholder='Email or phone']");
    public By signInOtp=By.xpath("//input[@placeholder='OTP']");

    public By signInNext=By.xpath("//button[@id='js--btn-next']");
    public By signInLoginButton=By.xpath("//input[@placeholder='OTP']");
    public By signInWelcomePopup=By.xpath("//div[@class='modal_modal__RCZrz']");
    public By welcomeToRokomari=By.xpath("//p[normalize-space()='Welcome to Rokomari.com!']");
    public By loginName=By.xpath("//span[@class='user-name']");
    public By myProfileButton=By.xpath("//a[normalize-space()='My Profile']");
    public By signInmyAccountButton=By.xpath("//a[normalize-space()='My Account']");


    TimeOut time=new TimeOut();

    @Step("Sign In with gmail and OTP")
    public void signup(){
     loadAnWebPage("https://www.rokomari.com/login");
        writeOnElement(signInEmail,signInEmailText); //Beacuse we use previous session for login
        clickOnElement(signInNext);
        time.timeOut(15000);
    }
    @Step("My Profile Section")
    public void  myProfileSection(){
       loadAnWebPage(profilepage);
    }
    @Step("Collect Username or email after Login")
    public String userName(){
        return getText(signInEmail);
    }
    @Step("Highlight user name after successful sign-up")
    public void userNameHighlight() {
        highlighter(loginName);
    }





}
