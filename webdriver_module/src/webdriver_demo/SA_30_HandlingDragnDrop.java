package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SA_30_HandlingDragnDrop extends baseFunctions {

	public static void main(String[] args) {
		launchBrowser("chrome");
		Actions ac = new Actions(driver);
		launchURL("https://jqueryui.com/droppable/");

		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement drag = driver.findElement(By.id("draggable")); // source
		WebElement drop = driver.findElement(By.id("droppable")); // destination

		ac.dragAndDrop(drag, drop).build().perform();
	}

	
	public void testB() {

	}

	public void testC() {

	}

	public void testD() {

	}
}
