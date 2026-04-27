package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ReservePage {

	WebDriver driver;

	final String selectFlight = "//td[text()='%s']";

	public ReservePage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void selectFlight(String filterName) {
		System.out.println(String.format(selectFlight, filterName));
		driver.findElement(By.xpath(String.format(selectFlight, filterName))).click();
		
	}
}
