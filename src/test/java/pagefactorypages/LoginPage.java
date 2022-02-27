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

    public void openLoginPage() {
        driver.get(WebUrl.SAUCEDEMO_URL);
    }

    public void usernameInput() {
        usernameInput.sendKeys("standard_user");
    }

    public void passwordInput() {
        passwordInput.sendKeys("secret_sauce");
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}