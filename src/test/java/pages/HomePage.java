package pages;

import io.qameta.allure.Step;
import models.CommonMethods;
import models.Locators;
import models.TimeOut;

public class HomePage extends CommonMethods {
    Locators lc=new Locators();
    TimeOut time=new TimeOut();

    public void loadHomePage(){
        loadAnWebPage(lc.pageURL);
    }
    @Step("Collect actual current page URL")
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
            clickOnAButtonJs(lc.hompagePopupBannarJs);
        } catch (Exception e) {
            System.out.println("Pop up is not present");
        }
        time.timeOut();
    }
}
