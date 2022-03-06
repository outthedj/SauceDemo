package driver.factorydriver;

import org.openqa.selenium.chrome.ChromeDriver;
import utilities.PropertiesManager;

public class ChromeDriverManager extends DriverManager{

    @Override
    protected void createDriver() {
        PropertiesManager propertiesManager = new PropertiesManager();
        System.setProperty("webdriver.chrome.driver", propertiesManager.get("PATH_TO_CHROME_DRIVER"));
        driver = new ChromeDriver();
    }
}
