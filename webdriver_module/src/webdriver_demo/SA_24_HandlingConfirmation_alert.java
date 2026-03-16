package webdriver_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SA_24_HandlingConfirmation_alert extends baseFunctions {

	public static void main(String[] args) {

		launchBrowser("chrome");
		driver.get("https://demoqa.com");

		// Alert is an interface in selenium
		Alert alt;

		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div[2]/div/a[3]/div/div/div[3]/h5")).click();

		driver.findElement(By.xpath("(//*[@id='item-1']/a/span)[2]")).click();

		driver.findElement(By.id("confirmButton")).click();
		alt = driver.switchTo().alert();

		System.out.println("text present on alert " + alt.getText());

		// dismiss /cancel the alert
		alt.dismiss(); // click on cancel button
		//alt.accept(); // click on ok button

		String alertAcceptanceResult = driver.findElement(By.id("confirmResult")).getText();
		
		System.out.println("confirmation text "+alertAcceptanceResult);

	}
}
