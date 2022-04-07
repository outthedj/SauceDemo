package pagefactorypages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;

public class LinkedInPage extends BasePage{

    @FindBy(className = "nav__logo-link")
    public WebElement linkedInLogo;

    ArrayList<String> newTabs;
    WebDriverWait webDriverWait;

    public LinkedInPage(WebDriver driver) {
        super(driver);
    }

    @Override
    @Step("Checking is LinkedIn logo displayed")
    public boolean isElementExist() {
        return linkedInLogo.isDisplayed();
    }

    @Step("Switching to LinkedIn tab")
    public boolean newTabForLinkedin() {
        ArrayList<String> newTabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(newTabs.get(1));
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("nav__logo-link")));
        boolean a;
        return a = driver.findElement(By.className("nav__logo-link")).isDisplayed();
    }
}
