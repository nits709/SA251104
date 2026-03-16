package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Sa13_LocatoeByTagName extends baseFunctions {

// numberofLinks = 35
	// i = 0

	public static void main(String[] args) {

		launchBrowser("chrome");
		driver.get("https://facebook.com");

		// interacts with mulitple elements
		List<WebElement> noOfLinks = driver.findElements(By.tagName("a")); // list<webElement>  35 | 50
		System.out.println("number of links present overwebpage " + noOfLinks.size());

		System.out.println("link Name " + noOfLinks.get(0).getText()); // return the name of links which present at 0th
																		// indenx list
		System.out.println("Link Name " + noOfLinks.get(10).getText()); // return the name of links which present at
																		// 10th indenx list

		for (int i = 0; i < noOfLinks.size(); i++) {  // 
			System.out.println("link Name " + noOfLinks.get(i).getText()); // common scenario Automation.
		}

		driver.close();

	}
}
