package day_04.proje;

import day_04.utils.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Test1 extends HomePage{

    HomePage homePage = new HomePage();
    NewAdressFormPage newAdressFormPage = new NewAdressFormPage();

    @Test
    public void test1(){
        homePage.gotoUrl();
        homePage.gotoClick();
        homePage.gotoSendKeys();
    }

    @Test(priority = 1)
    public void test2() throws InterruptedException {
        newAdressFormPage.gotoAdress();
        newAdressFormPage.createAdress();
        newAdressFormPage.gotoSelect();

    }
    /*
    @AfterTest
    public void afterTest() throws InterruptedException {
        sleep(2000);
        driver.quit();

    }

     */
}
