package driverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.devtools.v85.page.Page;

public class PageDriver {
    private static final ThreadLocal<WebDriver> LOCAL_DRIVER = new ThreadLocal<>();
    private static PageDriver instance = null;

    public static PageDriver getInstance() {
        if (instance == null) {
            instance = new PageDriver();
        }
        return instance;
    }
    public static void setDriver(WebDriver driver){
        PageDriver.LOCAL_DRIVER.set(driver);
    }

    public static WebDriver getDriver(){

        return LOCAL_DRIVER.get();
    }
    public static WebDriver getCurrentDriver() {
        return getInstance().getDriver();
    }
}
