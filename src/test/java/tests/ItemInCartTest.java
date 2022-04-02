package tests;

import com.sun.net.httpserver.Authenticator;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
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
    private static final Logger LOGGER = LogManager.getLogger(ItemInCartTest.class.getName());

    @Test(retryAnalyzer = Retry.class)
    public void loginTest() throws IOException {
        LOGGER.info("Starting");
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        cartPage = new CartPage(driver);
        LOGGER.info("Opening " + loginPage.getClass().getName() + "page");
        loginPage.openLoginPage();
        LOGGER.info("Inputting username");
        loginPage.usernameInput();
        LOGGER.info("Inputting password");
        loginPage.passwordInput();
        LOGGER.info("Clicking login button");
        loginPage.clickLoginButton();
        LOGGER.info("Adding item to cart");
        inventoryPage.addToCartSauceLabsBackpack();
        LOGGER.info("Opening shopping cart");
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
