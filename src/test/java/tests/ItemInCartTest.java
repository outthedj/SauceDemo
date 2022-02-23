package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.InventoryPage;
import pagefactorypages.LoginPage;

public class ItemInCartTest extends BaseTest {

    LoginPage loginPage;
    InventoryPage inventoryPage;

    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        loginPage.openLoginPage();
        loginPage.usernameInput();
        loginPage.passwordInput();
        loginPage.clickLoginButton();
        inventoryPage.addToCartSauceLabsBackpack();
        inventoryPage.openShoppingCartpage();
        String isPriceCorrect = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        Assert.assertEquals(isPriceCorrect, "$29.99");
        String isNameCorrect = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
        Assert.assertEquals(isNameCorrect, "Sauce Labs Backpack");
    }
}
