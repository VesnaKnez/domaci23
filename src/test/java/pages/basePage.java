package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
    protected WebDriver driver;
    protected WebDriverWait driverWait;

    public basePage (WebDriver driver, WebDriverWait driverWait) {
        this.driver = driver;
        this.driverWait = driverWait;

        PageFactory.initElements(this.driver,this);
    }
}
