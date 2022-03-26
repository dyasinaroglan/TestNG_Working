package day_03.pageModals.m7PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class ParentClass {

    WebDriver driver;
    WebDriverWait wait;

    public static final String url = "https://opencart.abstracta.us/index.php";
    public static final By myAccount = By.cssSelector("a[title='My Account']");
    public static final By login = By.linkText("Login");
    public static final By email = By.id("input-email");
    public static final By password = By.id("input-password");
    public static final By loginButton = By.cssSelector("input[value='Login']");
    public static final By logout = By.xpath("//a[text()='Logout']");

    @FindBy(css = "a[title='My Account']")
    public WebElement eMyAccount;

    @FindBy(linkText = "Login")
    public WebElement eLogin;

    @FindBy(id = "input-email")
    public WebElement eEmail;

    @FindBy(id = "input-password")
    public WebElement ePassword;

    @FindBy(css = "input[value='Login']")
    public WebElement eLoginButton;

    @FindBy(xpath = "//a[text()='Logout']")
    public WebElement eLogout;

    public ParentClass(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));

        PageFactory.initElements(driver,this);
    }


    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }
}
