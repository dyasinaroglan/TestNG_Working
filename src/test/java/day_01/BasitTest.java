package day_01;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class BasitTest {

    @Test(enabled = false)
    public void test1() {

        Random random = new Random();

        int a = random.nextInt(10);
        int b = random.nextInt(10);  //a ve b sayıları 10 a kadar random değer alsın diyoruz

        int c = a + b;
        System.out.println("c : " + c);

        Assert.assertTrue(c<12);

    }
    @Test
    public void test2(){
        String expected = "Techno"; //benim beklediğim
        String actual = "Techno"; //ilk önce sistemin verdiği, sonra benim beklediğim

        Assert.assertEquals(actual,expected,"hata");
    }
}
