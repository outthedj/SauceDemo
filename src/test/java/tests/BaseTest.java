package tests;

import driver.factorydriver.DriverFactory;
import driver.factorydriver.DriverManager;
import driver.factorydriver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import staticdata.WebTimeouts;
import utilities.TestListeners;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

@Listeners(TestListeners.class)
public class BaseTest {

    WebDriver driver;
    DriverManager driverManager;

    @BeforeSuite
    @Parameters({"browser"})
    public void setUp(@Optional("chrome") String browser) throws MalformedURLException {
        DriverFactory factory = new DriverFactory();
        DriverType driverType = null;
        if(browser.equals("chrome")) {
            driverType = DriverType.CHROME;
        }
        driverManager = factory.getManager(DriverType.REMOTE);
        driverManager.createDriver();
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(WebTimeouts.SCRIPT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(WebTimeouts.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(WebTimeouts.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
}