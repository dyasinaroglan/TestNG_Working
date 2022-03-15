package day_01;

import org.testng.annotations.Test;

public class _03Attributes {

    @Test(testName = "1 nolu test",priority = 2)
    public void test01(){
        String str = "1";
    }
    @Test(testName = "2 nolu test",priority = -1)
    public void test02(){
        System.out.println("test02");
    }
    @Test(testName = "3 nolu test",priority = 1)
    public void test03(){
        System.out.println("test03");
    }
    @Test(testName = "4 nolu test",timeOut = 2000)
    public void test04(){
        System.out.println("test04");
    }
    @Test(testName = "5 nolu test",priority = 3,invocationCount = 2)
    public void test05(){
        System.out.println("test05");
    }
    @Test(testName = "6 nolu test",enabled = false)
    public void test06(){
        System.out.println("test06");
    }
}
