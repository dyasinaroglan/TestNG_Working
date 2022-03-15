package day_01;

import org.testng.annotations.*;

public class _05Giris {

    @AfterClass
    public void afterClass(){
        System.out.println("sistem kapanıyor");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("sistem açılıyor...");
    }
    @Test
    public void test01(){
        System.out.println("test01");
    }
    @Test
    public void test02(){
        System.out.println("test02");
    }
    @Test(groups = "grupA")
    public void test03(){
        System.out.println("test03");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }
}
