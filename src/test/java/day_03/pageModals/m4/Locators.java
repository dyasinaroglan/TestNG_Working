package day_03.pageModals.m4;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Locators {

    public static final String url = "https://opencart.abstracta.us/index.php";
    public static final By myAccount = By.cssSelector("a[title='My Account']");
    public static final By login = By.linkText("Login");
    public static final By email = By.id("input-email");
    public static final By password = By.id("input-password");
    public static final By loginButton = By.cssSelector("input[value='Login']");
    public static final By logout = By.xpath("//a[text()='Logout']");
}
