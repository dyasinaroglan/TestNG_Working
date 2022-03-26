package day_03.pageModals.m8PageFactory;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class PageModal extends ParentClass {

    @Test
    public void testLogin(){
        LoginPO loginPO = new LoginPO(driver);  //LoginPO classındaki elementleri burada kullan. nesneye de driver gönderdim
        driver.get(url);
        loginPO.eMyAccount.click();
        loginPO.eLogin.click();
        loginPO.eEmail.sendKeys("testngkurs@gmail.com");
        loginPO.ePassword.sendKeys("testngkurs");
        loginPO.eLoginButton.click();
        wait.until(ExpectedConditions.titleIs("My Account"));

    }
}
