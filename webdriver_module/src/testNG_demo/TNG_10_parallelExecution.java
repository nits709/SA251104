package testNG_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TNG_10_parallelExecution {

	@Test
	public void test1() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("test1");
	}

	@Test
	public void test2() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/");
		System.out.println("test2");
	}

	@Test
	public void test3() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		System.out.println("test3");
	}

	@Test
	public void test4() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		System.out.println("test4");
	}

}
