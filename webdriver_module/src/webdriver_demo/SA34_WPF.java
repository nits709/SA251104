package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SA34_WPF extends baseFunctions {
	
	
	By userNameElement = By.name("email");
	By passwordElement = By.name("email");
	By loginButton = By.cssSelector("[aria-label='Log in']");
	
	
	@BeforeMethod
	public void setBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}

	@Test
	public void loginTest() {
		driver.findElement(userNameElement).sendKeys("nitin@yopmail.com");
		driver.findElement(passwordElement).sendKeys("xxxxx");
		driver.findElement(loginButton).click();

	}

	@AfterMethod
	public void quitBrowser() {
		quitBrowser();
	}

	
	
	
	
	
	
}
