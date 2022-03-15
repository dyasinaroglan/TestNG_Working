package day_01;

import org.testng.annotations.*;

public class _02Annotations {

    @Test
    void test1(){
        System.out.println("test1");
    }
    @Test
    void test2(){
        System.out.println("test2");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("beforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("afterTest");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClas");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite");
    }
    @BeforeGroups
    public void beforeGroups(){
        System.out.println("beforegroups");
    }
    @AfterGroups
    public void afterGroups(){
        System.out.println("afterGroups");
    }
}
