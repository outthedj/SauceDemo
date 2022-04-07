package pagefactorypages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage{

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement sauceLabsBackpack;

    @FindBy(className = "shopping_cart_link")
    private WebElement shoppingCartLink;

    @FindBy(linkText = "LinkedIn")
    private WebElement sauceLinkedInLogo;

    @FindBy(xpath = "//select[@data-test='product_sort_container']")
    private WebElement sortDropDown;

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @Override
    @Step("Checking is dropdown displayed")
    public boolean isElementExist() {
        return sortDropDown.isDisplayed();
    }
    @Step("Adding item to cart")
    public InventoryPage addToCartSauceLabsBackpack(){
        sauceLabsBackpack.click();
        return this;
    }

    @Step("Opening shopping cart page")
    public InventoryPage openShoppingCartpage(){
        shoppingCartLink.click();
        return this;
    }

    @Step("Opening LinkedIn page")
    public InventoryPage openLinkedIn(){
        sauceLinkedInLogo.click();
        return this;
    }
}
