package webdriver_demo;

import org.openqa.selenium.By;

public class SA_10_LocateByCSS_SpecialCharacter extends baseFunctions {

	public static void main(String[] args) {

		launchBrowser("chrome");
		driver.get("https://facebook.com");
		
		
		//username $ ends with  royal-email | XXXX-email
		driver.findElement(By.cssSelector("input[data-testid$='-email']")).sendKeys("adsasda");
		
		//password * 
		driver.findElement(By.cssSelector("input[data-testid*='p']")).sendKeys("asdasdadas");
		
		//login Button ^ - starts with
		driver.findElement(By.cssSelector("button[id^='u_0_5']")).click();
		
		
	}

}
