package webdriver_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class Sa_25_HandlingPromptAlert extends baseFunctions {

	public static void main(String[] args) {

		launchBrowser("chrome");
		driver.get("https://demoqa.com");

		// Alert is an interface in selenium
		Alert alt;

		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div[2]/div/a[3]/div/div/div[3]/h5")).click();

		driver.findElement(By.xpath("(//*[@id='item-1']/a/span)[2]")).click();

		// trigger the prompt alert
		driver.findElement(By.id("promtButton")).click();

		alt = driver.switchTo().alert();

		// sendkeys use to enter data in prompt
		alt.sendKeys("Selenium");
		alt.accept();

		System.out.println("prompt result " + driver.findElement(By.id("promptResult")).getText());

	}
}
