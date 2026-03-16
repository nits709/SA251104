package functionLibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class webdriverFunctions {

	WebDriver driver;

	public webdriverFunctions(WebDriver driver) {
		this.driver = driver;
	}

	public void click(By locators) {
		driver.findElement(locators).click();
	}

	public void type(By locators, String text) {
		driver.findElement(locators).sendKeys(text);
	}
}
