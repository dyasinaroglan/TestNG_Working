package day_04.proje;

import day_04.utils.ParentClass;
import org.testng.annotations.Test;

public class Test2 extends SearchClass {
    HomePage homePage1 = new HomePage();
    SearchClass searchClass = new SearchClass();

    @Test(priority = 1)
    public void test1(){
        searchClass.searchTo();
    }
    @Test
    public void gotoSite(){
        homePage1.gotoUrl();
        homePage1.gotoClick();
        homePage1.gotoSendKeys();
    }
    @Test(priority = 2)
    public void gotoİpod() throws InterruptedException {
        searchClass.ipodSelect();



    }
}
