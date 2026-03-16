package webdriver_demo;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class SA_22_HandlingRedBus_FluentWait extends baseFunctions{
	
	public static void main(String[] args) {
		launchBrowser("chrome");

		driver.get("https://www.redbus.in/");

		// from
		driver.findElement(By.id("srcinput")).sendKeys("Kolh");

		driver.findElement(By.cssSelector("div[aria-label^='Bus Stand']")).click();

		// To
		driver.findElement(By.id("destinput")).sendKeys("Bhop");

		
		//fluentWait
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver);  // 20 seconds
		fwait.withTimeout(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class)
		.ignoring(StaleElementReferenceException.class).pollingEvery(Duration.ofSeconds(2))
		.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector("div[aria-label^='Lal Ghati, Bhopal']"))).click();
		
		//driver.findElement(By.cssSelector("div[aria-label^='Lal Ghati, Bhopal']")).click();

		// click on calender
		driver.findElement(By.cssSelector("div[aria-label^='Select Date of Journey']")).click();
		// select the value

		driver.findElement(By.xpath("//span[text()='28']")).click();

		// search buses button
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/button")).click();

		// fetch the text from first bus
		System.out
				.println(driver.findElement(By.xpath("//*[@id=\"41802858\"]/div[1]/div[3]/div/div[1]/div")).getText());

		driver.close();

	}

}
