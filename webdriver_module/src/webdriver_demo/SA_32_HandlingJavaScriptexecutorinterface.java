package webdriver_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class SA_32_HandlingJavaScriptexecutorinterface extends baseFunctions {

	public static void main(String[] args) {

		launchBrowser("chrome");
	
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement e1 = driver.findElement(By.xpath("(//div[@class='card-body']//h5)[3]"));
		
		js.executeScript("arguments[0].click();", e1);

		// driver.close();
	}

}
