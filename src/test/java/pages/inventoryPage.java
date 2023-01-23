package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

public class inventoryPage extends basePage {

    @FindBy(className = "btn btn_primary btn_small btn_inventory")
    private WebElement buttonAdd;

    @FindBy(className = "shopping_cart_badge")
    private WebElement cartNumber;

    @FindBy(className = "shopping_cart_link")
    private WebElement cart;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement buttonRemove;

    public inventoryPage(WebDriver driver, WebDriverWait driverWait) {
        super(driver, driverWait);
    }

    public void addToCart() {
        buttonAdd.click();
    }

    public void remove() {
        buttonRemove.click();
    }
    public String getCartNumber() {
        return cartNumber.getText();
    }

    public String getCart() {
        return cart.getText();
    }

}
