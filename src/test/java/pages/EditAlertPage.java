package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Utility;

public class EditAlertPage extends Baseclass{
    @FindBy(xpath = "(//div[@class='z-listcell-content'])[3]")
    WebElement AlertId;

    @FindBy(xpath = "/html/body/div[1]/div/div[2]/table/tbody/tr/td/table/tbody/tr[5]/td/div/div[2]/button")
    WebElement clickEditButton;
    @FindBy(xpath = "/html/body/div[4]/div[2]/div/div[2]/div[1]/div/div[1]/div/div[2]/table/tbody[1]/tr[2]/td[2]/div/textarea")
    WebElement descriptionEdit;
    @FindBy(xpath = "(//button[@class='z-button'])[11]")
    WebElement editSubmitButton;

    public EditAlertPage(WebDriver driver) {
        super(driver);
    }
    public void editAlert() throws InterruptedException {

        AlertId.isSelected();
        clickEditButton.click();
        Thread.sleep(1000);
        descriptionEdit.clear();
        descriptionEdit.sendKeys(Utility.EDITDESCRIPTION);
        Thread.sleep(1000);
        editSubmitButton.click();
    }

  }
