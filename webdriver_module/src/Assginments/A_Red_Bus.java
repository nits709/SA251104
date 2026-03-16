package Assginments;

import org.openqa.selenium.By;

import webdriver_demo.baseFunctions;

public class A_Red_Bus extends baseFunctions {

	public static void main(String[] args) {
		launchBrowser("chrome");

		driver.get("https://www.redbus.in/");

		// from
		driver.findElement(By.id("srcinput")).sendKeys("Kolh");
		sleep(); //4 seconds
		driver.findElement(By.cssSelector("div[aria-label^='Bus Stand']")).click();

		// To
		driver.findElement(By.id("destinput")).sendKeys("Bhop");
		sleep();
		driver.findElement(By.cssSelector("div[aria-label^='Lal Ghati, Bhopal']")).click();

		sleep();
		// click on calender
		driver.findElement(By.cssSelector("div[aria-label^='Select Date of Journey']")).click();
		// select the value

		driver.findElement(By.xpath("//span[text()='28']")).click();

		// search buses button
		driver.findElement(By.xpath("//*[@id=\"root\"]/main/div/div/div[2]/search/div/div/button")).click();

		// fetch the text from first bus
		System.out.println(driver.findElement(By.xpath("//*[@id=\"41802858\"]/div[1]/div[3]/div/div[1]/div")).getText());
		
		driver.close();

	}
}
