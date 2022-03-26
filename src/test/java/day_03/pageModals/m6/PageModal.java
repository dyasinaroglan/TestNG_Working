package day_03.pageModals.m6;

import day_03.pageModals.m6.ParentClass;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class PageModal extends ParentClass {

    @Test
    public void testLogin(){
        driver.get(url);
        clickTo(myAccount);
        clickTo(login);
        sendKeysTo(email,"testngkurs@gmail.com");
        sendKeysTo(password,"testngkurs");
        clickTo(loginButton);
        wait.until(ExpectedConditions.presenceOfElementLocated(logout));

    }
}
