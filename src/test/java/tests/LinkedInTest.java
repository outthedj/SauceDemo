package tests;

import io.qameta.allure.Description;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
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
    private static final Logger LOGGER = LogManager.getLogger(LinkedInTest.class.getName());

    @Test(retryAnalyzer = Retry.class)
    @Description("Check if LinkedIn page is opened")
    public void loginTest() throws IOException {
        LOGGER.info("Starting");
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        linkedInPage = new LinkedInPage(driver);
        LOGGER.info("Opening " + loginPage.getClass().getName() + "page");
        loginPage.openLoginPage();
        LOGGER.info("Inputting username");
        loginPage.usernameInput();
        LOGGER.info("Inputting password");
        loginPage.passwordInput();
        LOGGER.info("Clicking login button");
        loginPage.clickLoginButton();
        LOGGER.info("Clicking login button");
        inventoryPage.openLinkedIn();
        LOGGER.info("Opening LinkedIn page");
        linkedInPage.newTabForLinkedin();
        TakesScreenshot screenShot = ((TakesScreenshot) driver);
        byte[] sourceFile = screenShot.getScreenshotAs(OutputType.BYTES);
        Files.write(Paths.get("src/test/resources/screenshot.png"), sourceFile);
        Assert.assertTrue(linkedInPage.newTabForLinkedin());
    }
}
