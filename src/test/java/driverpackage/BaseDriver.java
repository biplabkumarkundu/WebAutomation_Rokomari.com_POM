package driverpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

import static driverpackage.PageDriver.getDriver;
import static driverpackage.PageDriver.setDriver;

public class BaseDriver {
    private static String browser_name = System.getProperty("browser","Chrome");

    @BeforeSuite
    public void openABrowser(){
        WebDriver driver = getBrowser(browser_name);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        setDriver(driver);

    }

    @AfterSuite
    public void closeBrowser(){
        // Close Browser
        getDriver().quit();
    }

    public WebDriver getBrowser(String browser_name){
        if (browser_name.equalsIgnoreCase("chrome"))
            return new ChromeDriver();
        else if (browser_name.equalsIgnoreCase("firefox"))
            return new FirefoxDriver();
        else if (browser_name.equalsIgnoreCase("edge"))
            return new EdgeDriver();
        else {
            throw new RuntimeException("Browser is not currently available with the given name: " + browser_name);
        }
    }
}