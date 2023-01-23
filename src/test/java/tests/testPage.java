package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.sidebarPage;

public class testPage extends baseTest {
    sidebarPage sidebar;
    @BeforeClass
    public void beforeClass() {
        super.beforeClass();
        sidebar = new sidebarPage(driver, driverWait);
    }

    @BeforeMethod
    public void beforeMethod() {
        super.beforeMethod();
        loginPage.login("standard_user", "secret_sauce");
    }

    @Test

    public void logoutTest () {
        sidebar.logOut();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/");

        driver.get("https://www.saucedemo.com/inventory.html");
        Assert.assertEquals(loginPage.loginInvalid(), "Epic sadface: You can only access '/inventory.html' when you are logged in.");
    }
}



