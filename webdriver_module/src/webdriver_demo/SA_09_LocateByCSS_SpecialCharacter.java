package webdriver_demo;

import org.openqa.selenium.By;

public class SA_09_LocateByCSS_SpecialCharacter extends baseFunctions {
	
	
	
	
	public static void main(String[] args) {
		
		launchBrowser("chrome");
		driver.get("https://www.facebook.com/");
		
		
		// # Id
		driver.findElement(By.cssSelector("#email")).sendKeys("12345678909876543");
		
		//# id
		driver.findElement(By.cssSelector("#pass")).sendKeys("asdfghjhgfds");
	}

}
