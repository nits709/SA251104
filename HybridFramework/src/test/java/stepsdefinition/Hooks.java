package stepsdefinition;

import org.openqa.selenium.WebDriver;

import functionLibraries.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.ConfigReader;

public class Hooks {

	WebDriver driver;

	@Before
	public void setup() {
		driver = DriverFactory.initDriver();
		driver.get(ConfigReader.getProperties().getProperty("baseURl"));
	}

	@After
	public void closeBrowser() {
		driver.quit();
	}
}
