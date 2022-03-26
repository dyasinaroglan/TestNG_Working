package day_03.pageModals.m5;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class PageModal extends ParentClassPm{


    @Test
    public void login(){
        driver.get(url);
        driver.findElement(myAccount).click();
        driver.findElement(login).click();
        driver.findElement(email).sendKeys("testngkurs@gmail.com");
        driver.findElement(password).sendKeys("testngkurs");
        driver.findElement(loginButton).click();
        wait.until(ExpectedConditions.presenceOfElementLocated(logout));
    }
}
