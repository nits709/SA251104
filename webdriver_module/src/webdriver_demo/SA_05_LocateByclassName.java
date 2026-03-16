package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SA_05_LocateByclassName extends baseFunctions {
	
	
	//Enum - type of data, like String,array
	public static void main(String[] args) throws InterruptedException {
		
		launchBrowser("chrome");
		driver.get("https://google.co.in");
		
		driver.findElement(By.className("gLFyf")).sendKeys("WorldCup Schedule");
		
		
		//below perform enter on search field
		//driver.findElement(By.className("gLFyf")).sendKeys(Keys.ENTER);
		
		//hit the enter button of keyboard.
		//driver.findElement(By.className("gLFyf")).sendKeys(Keys.RETURN);
		
		//googlesearch button | 50-50
		driver.findElement(By.className("gNO89b")).click();
		
		Thread.sleep(4000);
		
		driver.close();
		
		
	}

}
