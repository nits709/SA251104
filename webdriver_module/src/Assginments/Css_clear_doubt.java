package Assginments;

import org.openqa.selenium.By;

import webdriver_demo.baseFunctions;

public class Css_clear_doubt extends baseFunctions{
	
	
	public static void main(String[] args) {
		
		
		
		launchBrowser("chrome");
		driver.get("https://www.facebook.com");
		
		//Username using Dot(.) and Hash(#) 
		driver.findElement(By.cssSelector(".inputtext._55r1._6luy#email")).sendKeys("hari@gmail.com");
		
		//Password using Dot(.) and Hash(#) 
		driver.findElement(By.cssSelector(".inputtext._55r1._6luy._9npi#pass")).sendKeys("156845534");
		
		//login button
		driver.findElement(By.cssSelector("#u_0_5")).click();
	}

}
