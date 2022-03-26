package day_03.pageModals.m7PageFactory;

import org.testng.annotations.Test;

public class PageModal extends ParentClass {

    @Test
    public void testLogin(){
        driver.get(url);
        eMyAccount.click();
        eLogin.click();
        eEmail.sendKeys("testngkurs@gmail.com");
        ePassword.sendKeys("testngkurs");
        eLoginButton.click();
        //wait.until(ExpectedConditions.(eLogout));

    }
}
