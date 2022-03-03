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

    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    public void addToCartSauceLabsBackpack(){
        sauceLabsBackpack.click();
    }

    public void openShoppingCartpage(){
        shoppingCartLink.click();
    }

    public void openLinkedIn(){
        sauceLinkedInLogo.click();
    }
}
