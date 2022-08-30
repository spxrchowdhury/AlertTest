package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AlertListPage extends Baseclass {
    @FindBy(xpath = "(//span[@class='z-menu-text'])[1]")
    WebElement ClickOption;
    @FindBy(xpath = "(//span[@class='z-menuitem-text'])[1]")
    WebElement ClickonAlert;
    @FindBy(xpath = "(//button[@class='z-button'])[1]")
    WebElement ClickSubmitButton;


    public AlertListPage(WebDriver driver) {
        super(driver);
    }
    public void alertList() throws InterruptedException {
        Thread.sleep(1000);
        ClickOption.click();
        ClickonAlert.click();
        Thread.sleep(1000);
        ClickSubmitButton.click();
        Thread.sleep(1000);

    }

}
