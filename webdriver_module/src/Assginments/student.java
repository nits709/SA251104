package Assginments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import webdriver_demo.baseFunctions;

public class student extends baseFunctions {

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.get("https://seleniumpractise.blogspot.com/?utm_source=chatgpt.com");

		System.out.println("text " + driver.findElement(By.xpath("//*[@id='state']")).getText());
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='btnAttach']"))).click();
		wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='state']"), "State: attached (hidden)"));
		//wait.until(ExpectedConditions.(By.xpath("//*[@id='state']")));
		
		System.out.println(driver.findElement(By.xpath("//*[@id='state']")).getText());
	}
}
