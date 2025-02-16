package pages;

import io.qameta.allure.Step;
import models.CommonMethods;
import models.Locators;
import models.TimeOut;

public class ProductsPage extends CommonMethods {

    Locators lc=new Locators();
    TimeOut time=new TimeOut();
    @Step("Hover on the লেখক button & click-on হুমায়ূন আহমেদ ")
    public void selectWriter(){
        hover(lc.writerButton);
        clickOnElement(lc.writerName);
        time.timeOut();
    }
    @Step("Return Page title")
    public String  pagetitle(){
        return getPageTitle();
    }

    @Step("Filter Category by selecting সমকালীন উপন্যাস and রচনা সংকলন ও সমগ্র")
    public void filterCategory(){
        scrollToElement(lc.publisherButton);
        time.timeOut();
        clickOnElement(lc.categorySomokalinUponnas);
        time.timeOut();
        scrollToElement(lc.publisherButton);
        clickOnElement(lc.categoryRochonaSomogro);
        time.timeOut();
    }
}
