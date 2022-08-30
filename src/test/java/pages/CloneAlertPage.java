package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Utility;

public class CloneAlertPage extends Baseclass {
    @FindBy(xpath = "//div[text()='RHC']")
    WebElement ClickanAlert;
    @FindBy(xpath = "(//button[@class='z-button'])[4]")
    WebElement ClickonCloneButton;
    @FindBy(xpath = "(//input[@class='z-textbox'])[3]")
    WebElement CloneAlertID;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div[1]/div/div[2]/div/div[2]/button")
    WebElement ClickcloneSaveButton;
    @FindBy(xpath = "//button[text()='OK']")
    WebElement CloneSaveOKButton;
    @FindBy(xpath = "(//button[@class='z-button'])[11]")
    WebElement AlertCloneSubmitButton;


    public CloneAlertPage(WebDriver driver) {
        super(driver);
    }
    public void cloneAlert() throws InterruptedException {
        ClickanAlert.click();
        ClickonCloneButton.click();
        Thread.sleep(1000);
        CloneAlertID.sendKeys(Utility.CLONE_ALERTID);
       // driver.findElement(By.xpath("(//input[@class='z-textbox'])[3]")).sendKeys("ABC");
        Thread.sleep(1000);
        ClickcloneSaveButton.click();
        Thread.sleep(1000);
        CloneSaveOKButton.click();
        AlertCloneSubmitButton.click();

    }

}
