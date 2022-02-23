package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchElements {

    WebDriver driver;

    @Test
    public void searchMethodTest(){ // First part of home work
        WebElement classname = driver.findElement(By.className("shopping_cart_link"));
        WebElement tagname = driver.findElement(By.tagName("body"));
        WebElement linktext = driver.findElement(By.linkText("LinkedIn"));
        WebElement partiallinktext = driver.findElement(By.linkText("Linked"));
        WebElement xPathAttribute = driver.findElement(By.xpath("//div[@class='inventory_item_price']"));
        WebElement xPathText = driver.findElement(By.xpath("//div[text()='29.99']"));
        WebElement xPathPartialContainsAttribute = driver.findElement(By.xpath("//div[contains(@class,'pee')]"));
        WebElement xPathPartialContainsText = driver.findElement(By.xpath("//div[contains(text(),'carry')]"));
        WebElement xPathAncestor = driver.findElement(By.xpath("//div[@id='inventory_container']/ancestor::div[@id='inventory_container']"));
        WebElement xPathParent = driver.findElement(By.xpath("//img/parent::button"));
        WebElement xPathAnd = driver.findElement(By.xpath("//input[@class='input_error form_input error' and @type='text']"));
        WebElement cssClass = driver.findElement(By.cssSelector(".submit-button"));
        WebElement cssId = driver.findElement(By.cssSelector("#user-name"));
        WebElement cssTag = driver.findElement(By.cssSelector("span"));
        WebElement cssAttribute1 = driver.findElement(By.xpath("[placeholder^=Pass]"));
        WebElement cssAttribute2 = driver.findElement(By.xpath("[data-test$=backpack]"));
        WebElement cssAttribute3 = driver.findElement(By.xpath("[class*=name]"));
        WebElement cssFirstChild = driver.findElement(By.cssSelector(".inventory_item:first-child"));
        WebElement cssNthChild = driver.findElement(By.cssSelector(".inventory_item:nth-child(3)"));
    }

}
