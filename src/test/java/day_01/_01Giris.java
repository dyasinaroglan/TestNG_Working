package day_01;

import org.testng.annotations.Test;

public class _01Giris {
    public _01Giris(){
        System.out.println("constructor");
    }

    {
        System.out.println("instance initiliazer");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
}
