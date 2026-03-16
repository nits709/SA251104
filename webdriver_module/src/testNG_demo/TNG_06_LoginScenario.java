package testNG_demo;

import org.testng.annotations.Test;

import webdriver_demo.baseFunctions;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;

public class TNG_06_LoginScenario extends baseFunctions {

	@BeforeTest
	public void beforeTest() { // browser and URL
		launchBrowser("chrome");
		launchURL("https://practicetestautomation.com/practice-test-login/");
	}

	@AfterTest
	public void afterTest() { // close browser
		quiteBrowser();
	}

	@Test(priority = 1)
	public void loginTestwithData() { // have test code
		// validate login functionality
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		// below ensure userloggedin or not
		String loginMsg = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"))
				.getText();
		System.out.println("message " + loginMsg);
		// logout the user
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

	}

	@Test(priority = 2)
	public void loginTestwithvalidData() { // have test code
		// validate login functionality
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		// below ensure userloggedin or not
		String loginMsg = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"))
				.getText();
		System.out.println("message " + loginMsg);
		// logout the user
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

	}

	@Test(priority = 3)
	public void loginTestwithInvalidData() { // have test code
		// validate login functionality
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("1Password123");
		driver.findElement(By.id("submit")).click();
		// below ensure userloggedin or not
		String loginMsg = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"))
				.getText();
		System.out.println("message " + loginMsg);
		// logout the user
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

	}

}
