package proje;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ParentClass;

public class HomePage extends ParentClass {

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
    public void loginPage(){
        clickTo(lMyAccount);
        clickTo(llogin);
    }
    public void fillFormAndSubmitButton(String email,String password){
        sendKeysTo(lemail,email);
        sendKeysTo(lpassword,password);
        clickTo(lloginButton);
        wait.until(ExpectedConditions.titleIs("My Account"));

    }

}
