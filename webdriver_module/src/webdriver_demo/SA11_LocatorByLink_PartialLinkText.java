package webdriver_demo;

import org.openqa.selenium.By;

public class SA11_LocatorByLink_PartialLinkText extends baseFunctions {

	public static void main(String[] args) {

		launchBrowser("chrome");
		driver.get("https://google.co.in");

		// linkText
		// driver.findElement(By.linkText("About")).click();

		// partialLink
		driver.findElement(By.partialLinkText("Adver")).click();

	}

}
