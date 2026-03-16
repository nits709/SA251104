package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SA33_Pagefactory_InSelenium extends baseFunctions {

	@FindBy(name="email")
	WebElement usernameField;
	@FindBy(name="pass")
	WebElement passwordField;
	
	@FindBy(xpath="xpath")
	List<WebElement> elemName;
	
	public void setUp() {
		PageFactory.initElements(driver, this);
	}
	
	@BeforeMethod
	public void setBrowser() {
		driver = new ChromeDriver();
		setUp();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}

	@Test
	public void loginTest() {

		usernameField.sendKeys("nitin@yopmail.com");
		passwordField.sendKeys("nitin@yopmail.com");
		driver.findElement(By.cssSelector("[aria-label='Log in']")).click();

	}

	@AfterMethod
	public void quitBrowser() {
		quitBrowser();
	}

}
