package webdriver_demo;

import org.openqa.selenium.By;

public class SA_07_LocateByCSS_SingleAttribute extends baseFunctions {

	public static void main(String[] args) {
		launchBrowser("chrome");

		driver.get("https://autotestacademy.com/#/auth");

		driver.findElement(By.cssSelector("input[placeholder='john@example.com']"))
				.sendKeys("nitingupta.gupta46@gmail.com");

		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("test@123");

		driver.findElement(By.cssSelector("button[type='submit']")).click();

	}

}
