package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;

import java.time.Duration;

public class ParentClass {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public ParentClass(){   //ParentClass da driver tanımlamazsak baplantıyı sağlayamayız. driver boş hatası verir. nullExceptipn
        //çünkü ParentClass ı HomePage ile extend ediyoruz. dolayısıyla ParentClass da tanımladığımız driver HomePage e taşınıyor.
        //TestClass1 de de HomePage sınıfından bir nesne oluşturduğumuz için otomatikman drive yine buraya taşınmış oluyor.

        driver = Driver.getDriver();
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        }

    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();

    }
    public void sendKeysTo(By locator,String str){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(str);

    }
    public void sleep(long milis){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
