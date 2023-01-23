package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import tests.baseTest;

import java.security.SecureRandom;

public class loginPage extends basePage {
    @FindBy(id = "user-name")
    protected WebElement username;

    @FindBy(id = "password")
    protected WebElement password;

    @FindBy(id = "login-button")
    protected WebElement loginButton;

    @FindBy(xpath = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3")
    protected WebElement poruka;



    public loginPage(WebDriver driver, WebDriverWait driverWait) {
            super(driver, driverWait);
        }


    public void login(String username, String password) {
        this.username.clear();
        this.password.clear();

        this.username.sendKeys(username);
        this.password.sendKeys(password);

        loginButton.click();
    }

    public String loginInvalid () {
        return poruka.getText();
    }


}
