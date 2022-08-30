package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Utility;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class AddAlertPage extends Baseclass {

    @FindBy(xpath = "(//button[@class='z-button'])[1]")
    WebElement ClickSubmitButton;

//Adding an Alert
    @FindBy(xpath = "//button[contains(text(),'Add')]")
    WebElement ClickAddbutton;
    @FindBy(xpath = "(//input[@class='z-textbox'])[3]")
    WebElement insertAlertID;
    @FindBy(xpath = "(//textarea[@class='z-textbox'])[1]")
    WebElement Description;
    @FindBy(xpath = "(//textarea[@class='z-textbox'])[2]")
    WebElement Messagebody;
    @FindBy(xpath = "(//button[@class='z-button'])[7]")
    WebElement Clickfilepickerbutton;
    @FindBy(xpath = "(//select[@class='z-select'])[2]")
    WebElement AlertResutType;
    @FindBy(xpath = "(//select[@class='z-select'])[3]")
    WebElement AlertType;
    @FindBy(xpath = "//a[@class='z-bandbox-button']")
    WebElement DatasourceLookup;
    @FindBy(xpath = "//div[text()='mainsaverDataSource']")
    WebElement Datasource;
    @FindBy(xpath = "(//textarea[@class='z-textbox'])[3]")
    WebElement sqlcode;
    @FindBy(xpath = "//button[@class='z-button' and @title='Click here to save alert.']")
    WebElement ClickSavebutton;

//Adding Target
    @FindBy(xpath = "//button[@class='z-messagebox-button z-button']")
    WebElement MessageboxOK;
    @FindBy(xpath = "//button[@class='z-button' and @title='Click here to manage targets.']")
    WebElement ClickinTargets;
    @FindBy(xpath = "(//button[@class='z-button'])[14]")
    WebElement AddTargetButton;

    @FindBy(xpath = "(//a[@class='z-bandbox-button'])[2]")
    WebElement TargetTypelookup;
    @FindBy(xpath = "(//input[@class='z-bandbox-input'])[2]")
    WebElement TargetType;
    @FindBy(xpath = "(//div[@class='z-hlayout-inner'])[22]")
    WebElement SaveButton;
    @FindBy(xpath = "//button[@class='z-messagebox-button z-button']")
    WebElement TargetSaveOKbutton;

//Adding Subscriber
    @FindBy(xpath = "(//button[@class='z-button'])[17]")
    WebElement SubscriberButton;
    @FindBy(xpath = "(//button[@class='z-button'])[21]")
    WebElement AddSubscriberButton;
    @FindBy(xpath = "(//select[@class='z-select'])[10]")
    WebElement InformBy;
    @FindBy(xpath = "(//select[@class='z-select'])[13]")
    WebElement AttachmentPDF;
    @FindBy(xpath = "(//button[@class='z-button'])[24]")
    WebElement SubscriberDetailsSubmitButton;
//Closing windows.
    @FindBy(xpath = "(//button[@class='z-button'])[18]")
    WebElement ClickTargetSubmitButton;
    @FindBy(xpath = "(//button[@class='z-window-icon z-window-close'])[2]")
    WebElement CloseTargetwindow;
    @FindBy(xpath = "(//button[@class='z-button'])[11]")
    WebElement AlertDetailSubmitWindow;


    public AddAlertPage(WebDriver driver) {
        super(driver);
    }

    public <SelectElement> void Alerts() throws InterruptedException, AWTException {
 //Adding an Alert
        ClickAddbutton.click();
        Thread.sleep(1000);
        insertAlertID.sendKeys(Utility.NEW_ALERTID);
        Description.sendKeys("This is a test for automation");
        Messagebody.sendKeys("Hi this is an email to test Alert automation");
        Thread.sleep(1000);
        Clickfilepickerbutton.click();

 //Adding file into file picker
        Robot rb = new Robot();
        rb.delay(1000);
//Copy the file into clipboard
        StringSelection ss = new StringSelection("C:\\dev_tools\\ReportXmlFiles\\Default.xml");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
//Paste the file
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        //Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);
        rb.delay(1000);
//Alert result type
        selectByVisibleTextFromDropDown(AlertResutType, "Number");
        selectByVisibleTextFromDropDown(AlertType, "SQL");
//Mainsaverdata source
        DatasourceLookup.click();
        Datasource.click();
        sqlcode.sendKeys("select count(wo) from wkaw");
        ClickSavebutton.click();
        Thread.sleep(1000);
        MessageboxOK.click();
        ClickinTargets.click();
        Thread.sleep(1000);
        AddTargetButton.click();
        Thread.sleep(1000);
 //Adding Value
        driver.findElement(By.xpath("//div[starts-with(@id,'targetPage')]//input[starts-with(@id,'value_textbox')]")).sendKeys("0");
        //Clicking on Target Type Upper
        TargetTypelookup.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/div[10]/div/div/div/table/tbody[1]/tr[3]/td/div")).click();
        SaveButton.click();
        Thread.sleep(1000);
        TargetSaveOKbutton.click();
//Adding Subscriber
        SubscriberButton.click();
        Thread.sleep(1000);
        AddSubscriberButton.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//input[@class='z-bandbox-input'])[6]")).sendKeys(Utility.USERNAME1);
        selectByVisibleTextFromDropDown(InformBy, "Email");
        selectByVisibleTextFromDropDown(AttachmentPDF, "PDF");
        SubscriberDetailsSubmitButton.click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//button[@class='z-window-icon z-window-close'])[4]")).click();

       ClickTargetSubmitButton.click();
       CloseTargetwindow.click();
       AlertDetailSubmitWindow.click();
        ClickSubmitButton.click();

        }
}