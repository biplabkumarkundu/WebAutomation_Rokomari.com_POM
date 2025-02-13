package models;

import org.openqa.selenium.By;

public class Locators {
    //Home Page
    public String homePageTitle ="Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";
   public String homePageURL ="https://www.rokomari.com/book";
    public String hompagePopupBannarJs = "document.querySelector(\"div[id='js--entry-popup'] i[class='ion-close-round']\")";
    public By homePagePopupBannerClose=By.xpath("//div[@class='modal_modal__RCZrz']//button");
    public By lekhokButton= By.xpath("//span[contains(text(),'লেখক')]");


    //Sign In/Login Page
    public String signInPageTitle="Login To Rokomari | Rokomari.com";
    public String signInEmailText="wodebes213@sectorid.com";
    public String signInOtpText="2925";
    public By signInButton=By.xpath("//a[normalize-space()='Sign In']");
    public By signInEmail=By.xpath("//input[@placeholder='Email or phone']");
    public By signInNext=By.xpath("//button[@id='js--btn-next']");
    public By signInOtp=By.xpath("//input[@placeholder='OTP']");
    public By signInLoginButton=By.xpath("//input[@placeholder='OTP']");

}
