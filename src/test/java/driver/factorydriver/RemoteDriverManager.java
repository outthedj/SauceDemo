package driver.factorydriver;

import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class RemoteDriverManager extends DriverManager{

    @Override
    public void createDriver() throws MalformedURLException {
        EdgeOptions browserOptions = new EdgeOptions();
        browserOptions.setCapability("platformName", "Windows 10");
        browserOptions.setCapability("browserVersion", "99");
        Map<String, Object> sauceOptions = new HashMap<>();
        browserOptions.setCapability("sauce:options", sauceOptions);
        driver = new RemoteWebDriver( new URL("https://oauth-cryptoout-ea685:2c59ce12-b84a-4c3d-a15d-841f10f10af8@ondemand.eu-central-1.saucelabs.com:443/wd/hub"), browserOptions);
    }
}
