package day_04.proje;

import day_04.utils.ParentClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends ParentClass{

    String url = "http://opencart.abstracta.us/";
    By lMyAccount = By.cssSelector("a[title='My Account']");
    By llogin = By.xpath("(//a[text()='My Account'])[1]");
    By lemail = By.id("input-email");
    By lpassword = By.id("input-password");
    By lloginButton = By.cssSelector("input[value='Login']");

    By lMyAccountClick = By.xpath("(//a[text()='My Account'])[1]");


    public void gotoUrl(){
        driver.get(url);
    }
    public void gotoClick(){
        clickTo(lMyAccount);
        clickTo(llogin);
    }
    public void gotoSendKeys(){
        sendKeysTo(lemail,"testngkurs@gmail.com");
        sendKeysTo(lpassword,"testngkurs");
        clickTo(lloginButton);
        wait.until(ExpectedConditions.titleIs("My Account"));
    }
}
