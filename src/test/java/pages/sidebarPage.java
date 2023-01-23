package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class sidebarPage extends basePage {

    @FindBy(id = "react-burger-menu-btn")
    private WebElement sideBar;

    @FindBy(id = "logout_sidebar_link")
    private WebElement logOutButton;

    public sidebarPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

public void logOut () {
        sideBar.click();
        driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id("logout_sidebar_link")));
        logOutButton.click();
}
}
