package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Utility;

public class DeleteAlertPage extends Baseclass {

    @FindBy(xpath = "//div[text()='SSS']")
    WebElement Created_Alert;
    @FindBy(xpath = "//div[text()='Clone1']")
    WebElement cloneID;
    @FindBy(xpath = "(//button[@class='z-button'])[5]")
    WebElement ClickDeleteButton;
    @FindBy(xpath = "//button[text()='Yes']")
    WebElement ClickPopupOKButton;

    public DeleteAlertPage(WebDriver driver) {
        super(driver);
    }

    public void deleteCreatedAlert () throws InterruptedException {
       Created_Alert.click();
        ClickDeleteButton.click();
        Thread.sleep(1000);
        ClickPopupOKButton.click();

    }

    public void deleteCloneAlert() throws InterruptedException {
      cloneID.click();
      Thread.sleep(1000);
        ClickDeleteButton.click();
        Thread.sleep(1000);
        ClickPopupOKButton.click();



    }
}
