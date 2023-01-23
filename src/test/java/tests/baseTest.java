package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.loginPage;

import java.time.Duration;

public abstract class baseTest {

    protected WebDriver driver;
    protected WebDriverWait driverWait;
    protected loginPage loginPage;



    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.chrome.driver", "D:\\ITBOOTCAMP\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driverWait = new WebDriverWait(driver, Duration.ofSeconds(30));
        loginPage = new loginPage(driver, driverWait);
    }

    @BeforeMethod
    public void beforeMethod(){
        driver.get("https://www.saucedemo.com/");
    }

    @AfterClass
    public void afterClass(){
        driver.quit();
    }
}


