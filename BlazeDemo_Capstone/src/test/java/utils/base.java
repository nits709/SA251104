package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class base {

	protected WebDriver driver;

	
	@BeforeTest
	public void setUp() {
		System.out.println("@BeforeTest");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");

	}

	@AfterTest
	public void tearDown() {

		System.out.println("@AfterTest");
		driver.quit();

	}

}
