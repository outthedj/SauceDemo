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

    public void isNameOfItemCorrect(){
        nameOfItem.getText();
        String isNameCorrect = driver.findElement(By.xpath("//div[@class='inventory_item_name']")).getText();
        Assert.assertEquals(isNameCorrect, "Sauce Labs Backpack");
    }

    public void isPriceOfItemCorrect(){
        priceOfItem.getText();
        String isPriceCorrect = driver.findElement(By.xpath("//div[@class='inventory_item_price']")).getText();
        Assert.assertEquals(isPriceCorrect, "$29.99");
    }
}
