package pagefactorypages;

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
    public boolean isElementExist() {
        return sortDropDown.isDisplayed();
    }

    public InventoryPage addToCartSauceLabsBackpack(){
        sauceLabsBackpack.click();
        return this;
    }

    public InventoryPage openShoppingCartpage(){
        shoppingCartLink.click();
        return this;
    }

    public InventoryPage openLinkedIn(){
        sauceLinkedInLogo.click();
        return this;
    }
}
