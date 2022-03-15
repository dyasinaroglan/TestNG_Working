package day_01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class _04Example {
    /*
      https://opensource-demo.orangehrmlive.com/index.php/auth/login
        @BeforeClass"da
            driver tanimlayin
        @Test
            siteye gidin, title"i assert edin

        @Test
            login olun, login oldugunuzu assert edin

        @AfterClass
            driveri kapatin
     */


    WebDriver driver;
    String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
    By userName = By.id("txtUsername");
    By password = By.id("txtPassword");
    By submit = By.id("btnLogin");

    @BeforeClass
    public void driverTanımla(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    @Test
    public void siteGit(){
        driver.get(url);
        Assert.assertTrue(driver.getTitle().contains("OrangeHRM"));
    }
    @Test(dependsOnMethods = "siteGit")
    public void logın(){
        driver.findElement(userName).sendKeys("Admin");
        driver.findElement(password).sendKeys("admin123");
        driver.findElement(submit).click();
        String welcomeText = driver.findElement(By.id("welcome")).getText();
        Assert.assertTrue(welcomeText.contains("Welcome"));
    }
    @AfterClass
    public void quit(){
        driver.quit();
    }
}
