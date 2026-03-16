package webdriver_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_26_HandlingBrowserActions {

	// class implements interface | 1
	// class extends class | 2
	// interface implement interface
	// interface extends interface 3

	// goBack,goForward,refresh method available in naivgation interface.
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // open the browser only

		driver.get("https://google.co.in");

		String googleTitle = driver.getTitle();
		System.out.println("title -1 " + googleTitle);

		driver.navigate().to("https://facebook.com");

		String FacebookTitle = driver.getTitle();
		System.out.println("title -2 " + FacebookTitle);

		driver.navigate().back(); // simulates back button of browser.

		String gTitle = driver.getTitle();
		System.out.println("title -3 " + gTitle);

		driver.navigate().forward(); // simulates forward action of browser

		Thread.sleep(2000);
		driver.navigate().refresh();

		// driver.close();
	}

}
