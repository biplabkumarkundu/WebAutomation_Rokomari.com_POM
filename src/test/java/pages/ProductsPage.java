package pages;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import models.CommonMethods;
import models.TimeOut;
import org.openqa.selenium.By;

public class ProductsPage extends CommonMethods {
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
    public By currentpageNumber = By.cssSelector(".current");

    public By addToCartItem=By.xpath("//div[@title='এবং হিমু হুমায়ূন আহমেদ']");
    public By addToCartButton=By.xpath("//div[@title='এবং হিমু হুমায়ূন আহমেদ']//div[1]//div[3]//button[1]");

    TimeOut time=new TimeOut();
    HomePage homePage=new HomePage();

    @Step("Close home page popup banner")
    public void closePopupBannaer() {
        time.timeOut(5000);
        try {
            clickOnElement(homePage.homePagePopupBannerClose);
        } catch (Exception e) {
            System.out.println("Pop up is not present");
        }
        time.timeOut();
    }
    @Step("Hover on the লেখক button & click-on হুমায়ূন আহমেদ ")
    public void selectWriter(){
        hover(writerButton);
        clickOnElement(writerName);
        time.timeOut(2000);
    }
    @Step("Return Page title")
    public String  pagetitle(){
        return getPageTitle();
    }
    @Step("Collect actual current {1} ")
    public String text(By element, String name) {
        return getText(element);
    }
    @Step("Filter Category by selecting সমকালীন উপন্যাস and রচনা সংকলন ও সমগ্র")
    public void filterCategory(){
        scrollToElement(publisherButton);
        time.timeOut();
        clickOnElement(categorySomokalinUponnas);
        time.timeOut();
        scrollToElement(publisherButton);
        clickOnElement(categoryRochonaSomogro);
        time.timeOut();
    }

    @Step("Scroll down and go to next page")
    public void scrollAndGoToNextPage()
    {
        scrollToElement(nextPageIcon);
        clickOnButton(nextPageIcon);
        time.waitForPageLoad();
    }
    @Step("Select the fourth book on the page to add-to-cart")
    public void selcetBookandAddtoCart(){
        hover(addToCartItem);
        clickOnElement(addToCartButton);
        time.timeOut();
    }


}
