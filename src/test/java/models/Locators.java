package models;

import org.openqa.selenium.By;

public class Locators {
    public String pageTitle="Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";
   public String pageURL="https://www.rokomari.com/book";
    public By lekhokButton= By.xpath("//span[contains(text(),'লেখক')]");
    public By SignInButton=By.xpath("//a[normalize-space()='Sign in']");
    public By EmailorPhone=By.xpath("//a[normalize-space()='Sign In']");
    public By nextButton=By.xpath("//button[@id='js--btn-next']");
    public String hompagePopupBannarJs = "document.querySelector(\"div[id='js--entry-popup'] i[class='ion-close-round']\")";
}
