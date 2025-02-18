package pages;

import io.qameta.allure.Step;
import models.CommonMethods;
import models.TimeOut;
import org.openqa.selenium.By;

public class HomePage extends CommonMethods {

    TimeOut time=new TimeOut();

    public String homePageTitle ="Buy Book Online - Best Online Book Shop in Bangladesh | Rokomari.com";
    public String homePageURL ="https://www.rokomari.com/book";
    public String hompagePopupBannarJs = "document.querySelector(\"div[id='js--entry-popup'] i[class='ion-close-round']\")";
    public By homePagePopupBannerClose=By.xpath("//div[@class='modal_modal__RCZrz']//button");

    public void loadHomePage(){
        loadAnWebPage(homePageURL);
    }
    @Step(value = "Collect actual current page URL")
    public String getCurrentUrl() {
        return getLoadedPageUrl();

    }

    @Step("Collect actual current page title ")
    public String pagetitle() {
        return getPageTitle();
    }

    @Step("Close home page popup banner")
    public void closePopupBannaer() {
        time.timeOut(5000);
        try {
            clickOnElement(homePagePopupBannerClose);
        } catch (Exception e) {
            System.out.println("Pop up is not present");
        }
        time.timeOut();
    }
}
