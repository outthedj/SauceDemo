package tests;

import driver.singletondriver.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import staticdata.WebTimeouts;
import utilities.PropertiesManager;


import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;
    ChromeDriverManager chromeDriverManager;

    @BeforeMethod
    public void setUp(){
        chromeDriverManager = ChromeDriverManager.getInstanceOfChromeDriver();
        driver = chromeDriverManager.getDriver();
        chromeDriverManager.maximize();
        chromeDriverManager.setTimeout();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        chromeDriverManager.quitDriver();
    }
}
