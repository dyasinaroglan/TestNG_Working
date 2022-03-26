package day_03.pageModals.m5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class ParentClassPm {
    WebDriver driver;
    WebDriverWait wait;

    @AfterTest
    public void afterTest(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();
    }
    @BeforeTest
    public void beforeTest(){
        if(driver == null){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        }
    }


    public static final String url = "https://opencart.abstracta.us/index.php";
    public static final By myAccount = By.cssSelector("a[title='My Account']");
    public static final By login = By.linkText("Login");
    public static final By email = By.id("input-email");
    public static final By password = By.id("input-password");
    public static final By loginButton = By.cssSelector("input[value='Login']");
    public static final By logout = By.xpath("//a[text()='Logout']");
}
