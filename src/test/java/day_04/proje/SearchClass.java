package day_04.proje;

import day_04.utils.ParentClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class SearchClass extends ParentClass {

    By searchText = By.cssSelector("input[class='form-control input-lg']");
    By searchButton = By.cssSelector("button[class='btn btn-default btn-lg']");
    By urunListe = By.cssSelector("img[class='img-responsive']");
    By addToCart = By.id("button-cart");
    By viewCart = By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
    By productName = By.xpath("(//a[text()='iPod Touch'])[2]");
    By siyahButton = By.xpath("(//button[@data-toggle='dropdown'])[2]");



    public void searchTo(){
        clickTo(searchText);
        sendKeysTo(searchText,"ipod");
        clickTo(searchButton);

    }

    public void ipodSelect() throws InterruptedException {
        List<WebElement> ürünList = driver.findElements(urunListe);
        int random = (int) (Math.random()* (ürünList.size()));
        System.out.println(ürünList.get(random).getText());
        ürünList.get(random).click();
        wait.until(ExpectedConditions.elementToBeClickable(addToCart));
        clickTo(addToCart);
        wait.until(ExpectedConditions.presenceOfElementLocated(siyahButton));
        clickTo(siyahButton);
        sleep(2000);
        clickTo(viewCart);


    }

}
