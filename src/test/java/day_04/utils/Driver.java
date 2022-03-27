package day_04.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver {

    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver getDriver(){
        return getDriver("chrome");
    }

    public static WebDriver getDriver(String browser){
        if(driver == null){
            switch (browser){
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }
        }
        return driver;
    }
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(4000);
        if(driver != null){
            driver.quit();
            driver = null;
        }
    }
}
