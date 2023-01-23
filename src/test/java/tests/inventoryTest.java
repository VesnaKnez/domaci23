package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.inventoryPage;

public class inventoryTest extends baseTest {
    inventoryPage inventoryPage;

    @BeforeClass
    public void beforeClass() {
        super.beforeClass();
        inventoryPage = new inventoryPage(driver, driverWait);
    }

    @BeforeMethod
    public void beforeMethod() {
        super.beforeMethod();
        loginPage.login("standard_user", "secret_sauce");

    }

    @Test
    public void addProduct() {
        inventoryPage.addToCart();
        Assert.assertEquals(inventoryPage.getCartNumber(), ("1"));
    }

    @Test
    public void removeProduct() {

        inventoryPage.remove();
        //   Assert.assertEquals(inventoryPage.getCart(),"");
        Assert.assertTrue(inventoryPage.getCart().isEmpty());
    }
}