package Assginments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import webdriver_demo.baseFunctions;

public class Css_SpecialCharacter extends baseFunctions {

	//
	public static void main(String[] args) {

		launchBrowser("chrome");

		driver.get("https://google.co.in");

		// driver.findElement(By.cssSelector("input.truncate")).sendKeys("Search
		// button");
		// By . (class)
		// driver.findElement(By.cssSelector(".truncate")).sendKeys(Keys.ENTER);

		sleep();

		driver.close();
	}

}
