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

    public CartPage(WebDriver driver) {
        super(driver);
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
