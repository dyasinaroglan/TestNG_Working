package proje;

import org.testng.annotations.Test;
import utils.Driver;

public class TestClass1 {

    HomePage homePage = new HomePage();

    @Test
    public void testLogin(){
        homePage.gotoUrl();
        homePage.loginPage();
        homePage.fillFormAndSubmitButton("testngkurs@gmail.com","testngkurs");
    }
}
