package webdriver_demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

public class SA_28_WindowHandlinginSelenium extends baseFunctions {

	// iterator() | same as forloop in java
	public static void main(String[] args) throws InterruptedException {

		launchBrowser("chrome"); // main browser Tab
		launchURL("https://www.naukri.com/"); // main uRl

		System.out.println("getTitle of main page " + driver.getTitle());

		String m = driver.getWindowHandle();
		System.out.println("Main Window " + m);

		// click on MNC element
		driver.findElement(By.xpath("//*[@id='trending-naukri-wdgt']/div/div[1]/a[2]")).click();

		// driver.getWindowHandle(); // main window | ID
		Set<String> window = driver.getWindowHandles(); // Set<String> | List<String> returns id's of all open windows
		Iterator<String> it = window.iterator();

		String mainWindow = it.next(); // mainWindow
		String childWindow = it.next(); // childWindow

		System.out.println("Main ID " + mainWindow + " : " + "ChildWindow ID " + childWindow);

		driver.switchTo().window(childWindow); // on child window

		Thread.sleep(6000);
		System.out.println("title of child window " + driver.getTitle());

		// click on login button
		driver.findElement(By.xpath("//*[@id='login_Layer']")).click();

		String sliderText = driver
				.findElement(By.xpath("//*[@id='root']/div/div[3]/div[2]/div[2]/div/div[2]/div/div[1]/a")).getText();

		System.out.println("slider Text " + sliderText);

		driver.switchTo().window(mainWindow); // safest way to automate

		System.out.println("main page title " + driver.getTitle());
		
		driver.quit(); // quit will closed the opened browser in single session.

	}

}
