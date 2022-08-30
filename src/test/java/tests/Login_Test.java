package tests;

import pages.Baseclass;
import pages.LoginPage;
import pages.Logoutpage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Login_Test {
    public static WebDriver driver = new ChromeDriver();

    @BeforeClass
    public void setup(){
        Baseclass lbalurl = new Baseclass(driver);
        lbalurl.LaunchbrowserandLoadURL();
    }
    @AfterClass
    public void Teardown() throws InterruptedException {
        Thread.sleep(1000);
        Logoutpage logout = new Logoutpage(driver);
        logout.setLogout();
        driver.close();
    }


    @Test
    public void Loginwithcredential() throws InterruptedException {
        Thread.sleep(1000);
        LoginPage login = new LoginPage(driver);
        login.Login();

    }


}
