package day_03.pageModals.m8PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPO {

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

    public LoginPO(WebDriver driver){
        PageFactory.initElements(driver,this);

    }
}
