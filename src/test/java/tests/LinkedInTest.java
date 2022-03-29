package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.CartPage;
import pagefactorypages.InventoryPage;
import pagefactorypages.LinkedInPage;
import pagefactorypages.LoginPage;
import utilities.Retry;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LinkedInTest extends BaseTest{

    LoginPage loginPage;
    InventoryPage inventoryPage;
    LinkedInPage linkedInPage;

    @Test(retryAnalyzer = Retry.class)
    public void loginTest() throws IOException {
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        linkedInPage = new LinkedInPage(driver);
        loginPage.openLoginPage();
        loginPage.usernameInput();
        loginPage.passwordInput();
        loginPage.clickLoginButton();
        inventoryPage.openLinkedIn();
        linkedInPage.newTabForLinkedin();
        TakesScreenshot screenShot = ((TakesScreenshot) driver);
        byte[] sourceFile = screenShot.getScreenshotAs(OutputType.BYTES);
        Files.write(Paths.get("src/test/resources/screenshot.png"), sourceFile);
        Assert.assertTrue(linkedInPage.newTabForLinkedin());
    }
}
