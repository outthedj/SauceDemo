package tests;

import com.sun.net.httpserver.Authenticator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.CartPage;
import pagefactorypages.InventoryPage;
import pagefactorypages.LoginPage;
import utilities.Retry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ItemInCartTest extends BaseTest {

    LoginPage loginPage;
    InventoryPage inventoryPage;
    CartPage cartPage;

    @Test(retryAnalyzer = Retry.class)
    public void loginTest() throws IOException {
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
        TakesScreenshot screenShot = ((TakesScreenshot) driver);
        byte[] sourceFile = screenShot.getScreenshotAs(OutputType.BYTES);
        Files.write(Paths.get("src/test/resources/screenshot.png"), sourceFile);
        Assert.assertEquals(cartPage.isPriceCorrect, "$29.99");
    }
}
