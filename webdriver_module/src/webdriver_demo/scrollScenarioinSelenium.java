package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class scrollScenarioinSelenium extends baseFunctions {

	public static void main(String[] args) {
		launchBrowser("chrome");
		launchURL("https://omayo.blogspot.com/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,2000)"); // from top to bottom 0 to 2000
//		sleep();
//		js.executeScript("window.scrollBy(0,-500)"); // from bottom to top -500

//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)"); 
//		// from top to bottom 0 to end of page
//		sleep();
//		
//		//from bottom to top of page
//		js.executeScript("window.scrollTo(0,0)"); 

		// below ,scroll till the element is visible on the page.
		WebElement table = driver.findElement(By.id("table1"));
		js.executeScript("arguments[0].scrollIntoView(true)", table);

	}

}
