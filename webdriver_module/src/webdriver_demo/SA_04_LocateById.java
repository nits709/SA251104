package webdriver_demo;

import org.openqa.selenium.By;

public class SA_04_LocateById extends baseFunctions {

	public static void main(String[] args) throws InterruptedException {

		launchBrowser("Chrome");

		driver.get("https://facebook.com");

		// username
		driver.findElement(By.id("email")).sendKeys("nitin@gmail.com");

		// password
		driver.findElement(By.id("pass")).sendKeys("qwerty");

		// loginButton
		driver.findElement(By.name("login")).click();

		Thread.sleep(4000);

		driver.close();
	}

}
