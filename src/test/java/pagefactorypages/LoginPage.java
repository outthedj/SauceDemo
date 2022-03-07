package pagefactorypages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import staticdata.WebUrl;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    private WebElement usernameInput;

    @FindBy(id = "password")
    private WebElement passwordInput;

    @FindBy(id = "login-button")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage openLoginPage() {
        driver.get(WebUrl.SAUCEDEMO_URL);
        return this;
    }

    @Override
    public boolean isElementExist() {
        return loginButton.isDisplayed();
    }

    public LoginPage usernameInput() {
        usernameInput.sendKeys("standard_user");
        return this;
    }

    public LoginPage passwordInput() {
        passwordInput.sendKeys("secret_sauce");
        return this;
    }

    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }
}