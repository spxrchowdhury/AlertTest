package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;

public class Edit_Alert_Test {
    public WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void editalerttest() throws InterruptedException {
        // * Launch browser and load URL.
        Baseclass lbalurl = new Baseclass(driver);
        lbalurl.LaunchbrowserandLoadURL();
        Thread.sleep(1000);
//*Invoke login with credential.
        LoginPage login = new LoginPage(driver);
        login.Login();

//* This method will display Alert list
        AlertListPage AlertList = new AlertListPage(driver);
        AlertList.alertList();


    }
    @AfterClass
    public void teardown() throws InterruptedException {
        // *This method will logout first then browser will be closed.
        Logoutpage logout = new Logoutpage(driver);
        logout.setLogout();
        Thread.sleep(2000);
         driver.close();


    }

    @Test
    public void editAlert() throws InterruptedException {
        EditAlertPage editalertpage =new EditAlertPage(driver);
        editalertpage.editAlert();

    }

}
