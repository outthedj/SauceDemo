package pagefactorypages;

import io.qameta.allure.Step;
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

    @Step("Open '{WebUrl.SAUCEDEMO_URL}' url")
    public LoginPage openLoginPage() {
        driver.get(WebUrl.SAUCEDEMO_URL);
        return this;
    }

    @Override
    @Step("Checking is login button displayed")
    public boolean isElementExist() {
        return loginButton.isDisplayed();
    }

    @Step("Inputting username")
    public LoginPage usernameInput() {
        usernameInput.sendKeys("standard_user");
        return this;
    }

    @Step("Inputting password")
    public LoginPage passwordInput() {
        passwordInput.sendKeys("secret_sauce");
        return this;
    }

    @Step("Clicking login button")
    public LoginPage clickLoginButton() {
        loginButton.click();
        return this;
    }
}