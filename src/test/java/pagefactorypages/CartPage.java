package pagefactorypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CartPage extends BasePage{

    @FindBy(xpath = "//div[@class='inventory_item_price']")
    private WebElement nameOfItem;

    @FindBy(xpath = "//div[@class='inventory_item_name']")
    private WebElement priceOfItem;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public boolean isElementExist() {
        return checkoutButton.isDisplayed();
    }

    public String isNameCorrect;

    public String isNameOfItemCorrect(){
        return isNameCorrect = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
    }

    public String isPriceCorrect;

    public String isPriceOfItemCorrect(){
        return isPriceCorrect = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
    }
}
