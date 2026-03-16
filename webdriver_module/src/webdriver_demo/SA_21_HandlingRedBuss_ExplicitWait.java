package webdriver_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SA_21_HandlingRedBuss_ExplicitWait extends baseFunctions {

	public static void main(String[] args) {
		launchBrowser("chrome");

		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.redbus.in/"); //"https://asdasdadsa.com"; || 30 seconds

		// from
		driver.findElement(By.id("srcinput")).sendKeys("Kolh");

		driver.findElement(By.cssSelector("div[aria-label^='Bus Stand']")).click();

		// To
		driver.findElement(By.id("destinput")).sendKeys("Bhop");

		
		//explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15)); // 25 seconds
		wait
		.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[aria-label^='Lal Ghati, Bhopal']"))).click();
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
