package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;


public class Execute_Page extends  Baseclass {
    @FindBy(xpath = "//div[text()='RHC']")
    WebElement clickAlertfromlist;
    @FindBy(xpath = "(//button[@class='z-button'])[6]")
    WebElement executebutton;


    public Execute_Page(WebDriver driver) {
        super(driver);
    }

    public void executealert() {

        clickAlertfromlist.click();
        executebutton.click();


    }


}