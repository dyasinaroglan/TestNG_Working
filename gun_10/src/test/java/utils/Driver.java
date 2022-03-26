package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Locale;

public class Driver {

     public static WebDriver driver;
     public static WebDriverWait wait;

     public static WebDriver getDriver(){
         return getDriver("chrome");
     }

     public static WebDriver getDriver(String browser){
         if(driver == null){
             switch (browser.toLowerCase(Locale.ROOT)) {
                 case "firefox":
                 WebDriverManager.firefoxdriver().setup();
                 driver = new FirefoxDriver();
                 break;
                 default:
                     WebDriverManager.chromedriver().setup();
                     driver = new ChromeDriver();
             }
         }
         return driver;
     }
     public static void quitDriver(){
         if(driver != null){
             driver.quit();
             driver = null;
         }
         try {
             Thread.sleep(2000);
         } catch (InterruptedException e) {
             e.printStackTrace();
         }
     }

}
