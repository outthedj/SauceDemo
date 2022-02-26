package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.CartPage;
import pagefactorypages.InventoryPage;
import pagefactorypages.LoginPage;

public class ItemInCartTest extends BaseTest {

    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;

    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
        loginPage.openLoginPage();
        loginPage.usernameInput();
        loginPage.passwordInput();
        loginPage.clickLoginButton();
        inventoryPage.addToCartSauceLabsBackpack();
        inventoryPage.openShoppingCartpage();
        cartPage.isNameOfItemCorrect();
        Assert.assertEquals(cartPage.isNameCorrect, "$29.99");
        cartPage.isPriceOfItemCorrect();
        Assert.assertEquals(cartPage.isPriceCorrect, "$29.99");
    }
}
