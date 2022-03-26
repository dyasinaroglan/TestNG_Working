package day_03;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {

    @Test(dataProvider = "dataProviderObject")
    public void dataProvider(String str,int num){
        System.out.println(str+","+num);
    }

   @DataProvider(name = "dataProviderObject")
    public Object[][] dataProvider(){
       Object[][] data = new Object[][]{
               {"A",1},
               {"B",2},
               {"C",3}
       };
       return data;
   }
}
