package day_02.test;

import day_02.driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

public class BaseCLass extends Driver{
    public static WebDriver driver;
    public static WebDriverWait wait;
    Actions actions;
    JavascriptExecutor js = (JavascriptExecutor) driver;

    String url = "http://automationpractice.com/index.php";
    By lmenuBar = By.cssSelector(".sf-menu>li");
    By lcasualDresses = By.xpath("(//a[@title='Casual Dresses'])[1]");
    By llistClick = By.cssSelector("li[id='list']");
    By lmoreClick = By.cssSelector("a[class='button lnk_view btn btn-default']");
    By lImage = By.id("thumbs_list_frame");
    By laddToWishlist = By.cssSelector("a[id='wishlist_button']");
    By lmessage = By.cssSelector("p[class='fancybox-error']");

    String actual = "You must be logged in to manage your wishlist.";



    @BeforeTest
    @Parameters({"browser"})
    public void beforeTest(String browser){
        driver = Driver.getDriver();
    }
    @Test
    public void gotoUrl(){
        driver.get(url);
    }
    @Test(dependsOnMethods = {"gotoUrl"})
    public void menuBar(){
        actions = new Actions(driver);
        List<WebElement> menuList = driver.findElements(lmenuBar);
        actions.moveToElement(menuList.get(0)).build().perform();
        driver.findElement(lcasualDresses).click();
    }
    @AfterTest
    public void afterTest(){
        driver.findElement(lmessage);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lmessage));
        Assert.assertEquals(actual,lmessage);
        driver.quit();
    }
    @Test(dependsOnMethods = {"menuBar"})
    public void listClick(){
        driver.findElement(llistClick).click();
        driver.findElement(lmoreClick).click();
    }
    @Test
    public void actionsTest(){
        List<WebElement> ımageList = driver.findElements(lImage);
        for (WebElement webElement : ımageList) {
            actions.moveToElement(webElement).pause(200).build().perform();
        }
        js.executeScript("arguments[0].scrollIntoView(true);",laddToWishlist);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(laddToWishlist).click();
    }
}
