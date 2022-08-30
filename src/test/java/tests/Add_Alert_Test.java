package tests;

import pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

public class Add_Alert_Test {
    public static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setup() throws InterruptedException {
 /*
 * Launch browser and load URL.
  */
        Baseclass lbalurl = new Baseclass(driver);
        lbalurl.LaunchbrowserandLoadURL();
        Thread.sleep(1000);
//*Invoke login with credential.
        LoginPage login = new LoginPage(driver);
        login.Login();

        //****This method will display Alert list
        AlertListPage alerlist = new AlertListPage(driver);
        alerlist.alertList();


    }
    @AfterClass
    public void Teardown() throws InterruptedException {
    /*
    ** This method will delete created Alert
     */
        DeleteAlertPage deleteAlert = new DeleteAlertPage(driver);
        deleteAlert.deleteCreatedAlert();
        Thread.sleep(1000);


   // *This method will logout first then browser will be closed.
      Logoutpage logout = new Logoutpage(driver);
        logout.setLogout();
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    public void AlertAll() throws InterruptedException, AWTException {
        Thread.sleep(1000);
        AddAlertPage alert = new AddAlertPage(driver);
        alert.Alerts();
        Thread.sleep(1000);
    }
}
