package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class Clone_Alert_Test {

    public static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setup() throws InterruptedException {
        // * Launch browser and load URL.
        Baseclass lbalurl = new Baseclass(driver);
        lbalurl.LaunchbrowserandLoadURL();
        Thread.sleep(1000);
//*Invoke login with credential.
        LoginPage login = new LoginPage(driver);
        login.Login();

        // This method will display Alert list
        AlertListPage AlertList = new AlertListPage(driver);
        AlertList.alertList();
        Thread.sleep(1000);
    }
    @AfterClass
    public void Teardown() throws InterruptedException {
// This method will display Alert list
        AlertListPage AlertList = new AlertListPage(driver);
        AlertList.alertList();
        Thread.sleep(2000);
    // This method will Delete Cloned alert
    DeleteAlertPage delalert = new DeleteAlertPage(driver);
    delalert.deleteCloneAlert();

        // *This method will logout first then browser will be closed.
        Logoutpage logout = new Logoutpage(driver);
        logout.setLogout();
        Thread.sleep(2000);
         driver.quit();
    }
    @Test
    public void CloneAlert () throws InterruptedException {
        Thread.sleep(1000);
        CloneAlertPage clone = new CloneAlertPage(driver);
        clone.cloneAlert();

    }
}
