package Assginments;

import org.openqa.selenium.By;

import webdriver_demo.baseFunctions;

public class A_03 extends baseFunctions {

	//in classname selenium does not accepts more than one class name
	public static void main(String[] args) {
		
		launchBrowser("chrome");
		driver.get("https://www.facebook.com/");
		
		//username
		driver.findElement(By.className("inputtext _55r1 _6luy")).sendKeys("nitin");
		
		//password
		driver.findElement(By.className("inputtext _55r1 _6luy _9npi")).sendKeys("12345676432");

		
	}
}
