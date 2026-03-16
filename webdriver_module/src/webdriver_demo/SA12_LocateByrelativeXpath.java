package webdriver_demo;

import org.openqa.selenium.By;

public class SA12_LocateByrelativeXpath extends baseFunctions {

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.get("https://autotestacademy.com/#/auth");
		
		
		//username
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nitin@gmail.comn");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("2345678okjhgfde");
		
		//login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		

	}

}
