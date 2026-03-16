package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class SA_14_LocateByRelativeLocator extends baseFunctions {

	public static void main(String[] args) {

		
		launchBrowser("chrome");

		driver.get("https://facebook.com");

		// email field present above the password field
		driver.findElement(RelativeLocator.with(By.tagName("input")).above(By.id("pass"))).sendKeys("username");
		
		////password field present below the username(emailID)
		
		driver.findElement(RelativeLocator.with(By.tagName("input")).below(By.name("email"))).sendKeys("password");
		
		
		driver.close();
	}
}
