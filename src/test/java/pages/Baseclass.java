package pages;

import org.testng.annotations.AfterSuite;
import utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import java.util.List;

public class Baseclass {
    public WebDriver driver;

    public Baseclass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void LaunchbrowserandLoadURL() {
        System.setProperty("webdriver.chrome.driver", Utility.CHROMEDRIVER_LOCATION);
        driver.manage().window().maximize();
        driver.get(Utility.ADMIN_URL);
        driver.findElement(By.xpath("//button[@class='z-button']")).click();

    }

    public void selectByVisibleTextFromDropDown(WebElement element,String text){
        Select select=new Select(element);
        select.selectByVisibleText(text);
    }

    public void selectByValueFromDropDown(WebElement element,String value){
        new Select(element).selectByValue(value);

    }
    public void selectByIndexFromDropDown(WebElement element,int index){
        new Select(element).selectByIndex(index);
    }


    public void actionclass(WebElement dd){
        Actions action = new Actions(driver);
        action.moveToElement(dd);

    }

    public void selectByContainsTextFromDropDown(WebElement element, String text) {
        List<WebElement> allOptions = new Select(element).getOptions();
        for (WebElement options : allOptions) {
            if (options.getText().contains(text)) {
                options.click();
            }
        }
    }
}
