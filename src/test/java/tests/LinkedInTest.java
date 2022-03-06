package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagefactorypages.CartPage;
import pagefactorypages.InventoryPage;
import pagefactorypages.LinkedInPage;
import pagefactorypages.LoginPage;

public class LinkedInTest extends BaseTest{

    LoginPage loginPage;
    InventoryPage inventoryPage;
    LinkedInPage linkedInPage;

    @Test
    public void loginTest() {
        loginPage = new LoginPage(driver);
        inventoryPage = new InventoryPage(driver);
        linkedInPage = new LinkedInPage(driver);
        loginPage.openLoginPage();
        loginPage.usernameInput();
        loginPage.passwordInput();
        loginPage.clickLoginButton();
        inventoryPage.openLinkedIn();
        linkedInPage.newTabForLinkedin();
        Assert.assertTrue(linkedInPage.newTabForLinkedin());
    }
}
