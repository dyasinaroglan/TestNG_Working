package day_04.proje;

import day_04.utils.ParentClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class NewAdressFormPage extends ParentClass {

    By adressBook = By.xpath("(//a[text()='Address Book'])[1]");
    By newAdress = By.cssSelector("a[class='btn btn-primary']");

    By firstName = By.cssSelector("input[name='firstname']");
    By lastName = By.id("input-lastname");
    By adress1 = By.id("input-address-1");
    By city = By.id("input-city");
    By postCode = By.id("input-postcode");
    By country = By.id("input-country");
    By regionState = By.id("input-zone");
    By defaultAdress = By.cssSelector("input[value='1']");
    By continueButton = By.cssSelector("input[value='Continue']");
    By message = By.cssSelector("div[class='alert alert-success alert-dismissible']");


    public void gotoAdress(){
        clickTo(adressBook);
        clickTo(newAdress);
    }
    public void createAdress(){
        sendKeysTo(firstName,"yasin");
        sendKeysTo(lastName,"aroglan");
        sendKeysTo(adress1,"MALTEPE");
        sendKeysTo(city,"İSTANBUL");
        sendKeysTo(postCode,"34000");
    }
    public void gotoSelect() throws InterruptedException {
        WebElement eCountry = wait.until(ExpectedConditions.elementToBeClickable(country));
        eCountry.click();
        wait.until(ExpectedConditions.elementToBeClickable(country));
        selectTo(eCountry,"57");
        wait.until(ExpectedConditions.presenceOfElementLocated(regionState));
        WebElement eRegionState = wait.until(ExpectedConditions.elementToBeClickable(regionState));
        eRegionState.click();
        sleep(3000);
        selectTo(eRegionState,"909");

        wait.until(ExpectedConditions.visibilityOfElementLocated(defaultAdress));
        clickTo(defaultAdress);
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueButton));
        clickTo(continueButton);
        wait.until(ExpectedConditions.presenceOfElementLocated(message));
        sleep(3000 );
    }
}
