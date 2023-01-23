package tests;

import javafx.scene.input.InputMethodTextRun;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.loginPage;

public class loginTest extends baseTest {

    @Test

    public void loginPrviUser() {
        loginPage.login("standard_user", "secret_sauce");

        String actualLink = driver.getCurrentUrl();
        Assert.assertTrue(actualLink.contains("/inventory.html"));

    }
    @Test
    public void loginDrugiUser() {

        loginPage.login("locked_out_user", "secret_sauce");


        Assert.assertEquals(loginPage.loginInvalid(), "Epic sadface: Sorry, this user has been locked out.");


    }
    @Test
    public void loginTreciUser() {

        loginPage.login("standard_user", "1111" );

        Assert.assertEquals(loginPage.loginInvalid(),"Epic sadface: Username and password do not match any user in this service");



    }


}





