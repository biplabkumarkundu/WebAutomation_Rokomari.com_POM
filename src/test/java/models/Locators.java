package models;

import org.openqa.selenium.By;

public class Locators {
    //Home Page
    public String homePageTitle ="Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";
   public String homePageURL ="https://www.rokomari.com/book";
    public String hompagePopupBannarJs = "document.querySelector(\"div[id='js--entry-popup'] i[class='ion-close-round']\")";
    public By homePagePopupBannerClose=By.xpath("//div[@class='modal_modal__RCZrz']//button");



    //Sign In/Login Page
    public String signInPageTitle="Login To Rokomari | Rokomari.com";

    public String signInEmailText="senod56775@perceint.com";
    public String signInOtpText="3730";
    public String welcomeToRokomariText="Welcome to Rokomari.com!";

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



    //Products Page
    public String writerButtonText="লেখক";
    public String productPageTitle="Humayun Ahmed Books - হুমায়ূন আহমেদ এর বই | Rokomari.com";

    public By writerButton= By.xpath("//span[contains(text(),'লেখক')]");
    public By writerName =By.xpath("//a[contains(text(),'হুমায়ূন আহমেদ')]");

    //Filter Product Page
    public String somokaliUponnaseText="সমকালীন উপন্যাস ";
    public String rochonaSomogroText="রচনা সংকলন ও সমগ্র ";

    public By categorySomokalinUponnas=By.xpath("//label[contains(text(),'সমকালীন উপন্যাস')]");
    public By categoryRochonaSomogro=By.xpath("//div[@data-search-key='রচনা সংকলন ও সমগ্র Literature Collection']");
    public By publisherButton=By.xpath("//p[normalize-space()='By Publishers']");

    public By nextPageIcon=By.xpath("//i[@class='ion-chevron-right']");


}
