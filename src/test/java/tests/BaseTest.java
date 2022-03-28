package tests;

import driver.factorydriver.DriverFactory;
import driver.factorydriver.DriverManager;
import driver.factorydriver.DriverType;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import staticdata.WebTimeouts;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    DriverManager driverManager;

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        DriverFactory factory = new DriverFactory();
        driverManager = factory.getManager(DriverType.REMOTE);
        driverManager.createDriver();
        driver = driverManager.getDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(WebTimeouts.SCRIPT_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(WebTimeouts.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(WebTimeouts.IMPLICIT_TIMEOUT, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}