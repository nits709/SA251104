package webdriver_demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class SA_23_HandlingAlert extends baseFunctions {

	public static void main(String[] args) {

		launchBrowser("chrome");

		driver.get("https://demoqa.com");

		// Alert is an interface in selenium
		Alert alt;

		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div[2]/div/a[3]/div/div/div[3]/h5")).click();

		driver.findElement(By.xpath("(//*[@id='item-1']/a/span)[2]")).click();
		// click on Click Me button which triggers the normal alert.
		driver.findElement(By.id("alertButton")).click();

		alt = driver.switchTo().alert(); // here telling selenium now interat with alert
		
		//get the text from alert
		System.out.println("text on alert "+ alt.getText()); //(String)
		alt.accept();
		
		
		//driver.switchTo().defaultContent(); // this revert control back to driver.
		
		
		System.out.println("alert accepted");

	}

}
