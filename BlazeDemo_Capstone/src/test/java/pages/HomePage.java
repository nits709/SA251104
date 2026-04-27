package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	final static By depatureCity = By.name("fromPort");
	final static By destinationCity = By.name("toPort");
	final static By findFlights = By.cssSelector("input[value='Find Flights']");

	
	
	public void verifyHomePage() {
		Assert.assertTrue(driver.findElement(depatureCity).isDisplayed(),"Homepage not displayed"); // true
	}
	
	public void searchFlight(String from, String to) {

		new Select(driver.findElement(depatureCity)).selectByVisibleText(from);
		new Select(driver.findElement(destinationCity)).selectByVisibleText(to);
		driver.findElement(findFlights).click();

	}

}
