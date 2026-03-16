package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_03_LocateByName {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://facebook.com");

		// Read the element on the page whose name is email
		// sendkeys function to type or enter data/string into the textfield

		//username
		driver.findElement(By.name("email")).sendKeys("nitin@gmail.com");
		
		//password
		driver.findElement(By.name("pass")).sendKeys("qwertyuytrew");
		
		//loginButton
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(4000); // adding some wait to see  the execution properly
		driver.close();

	}
}
