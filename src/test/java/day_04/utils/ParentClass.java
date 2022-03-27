package day_04.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentClass {
    protected WebDriver driver;
    protected WebDriverWait wait;  //protected yapmamızın sebebi farklı package lardan extend edeceğimiz için. protected farklı packagelarda da
    //görülebiliyor.


    public ParentClass() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendKeysTo(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public void sleep(long milis) throws InterruptedException {
        Thread.sleep(200);
    }
    public void selectTo(WebElement element,String value){
        Select select = new Select(element);
        select.selectByValue(value);

    }
}
