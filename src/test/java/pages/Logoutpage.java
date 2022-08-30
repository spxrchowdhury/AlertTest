package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Logoutpage extends Baseclass {

    @FindBy(xpath = "(//span[@class='z-menu-text'])[1]")
    WebElement ClickOption;
    @FindBy (xpath = "//span[text()='Log out']")
    WebElement Logout;

    public Logoutpage(WebDriver driver) {
        super(driver);
    }

    public void setLogout(){

        ClickOption.click();
        Logout.click();

    }
}
