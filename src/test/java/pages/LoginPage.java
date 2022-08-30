package pages;

import utilities.Utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends Baseclass {
    //@FindBy(xpath = "//i[@class='glyphicon glyphicon-new-window']")
   // WebElement ClickloginButton;
    @FindBy(name = "j_username")
    WebElement Username;
    @FindBy(xpath = "(//input[@class='z-textbox'])[2]")
    WebElement Password;
    @FindBy(xpath = "//button[@class='z-button']")
    WebElement ClickSubmitButton;


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void Login(){

        Username.sendKeys(Utility.ADMINUSER_NAME);
        Password.sendKeys(Utility.ADMIN_PASSWORD);
        ClickSubmitButton.click();

    }

}


