package Assginments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A_09 {

	public static void main(String[] args) throws InterruptedException {
		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in");

		String googletitle = driver.getTitle();
		System.out.println("title 1 " + googletitle);

		driver.navigate().to("http://www.facebook.com");
		String facebooktitle = driver.getTitle();
		System.out.println("title 2 " + facebooktitle);

		driver.navigate().back(); // simulates the back button of thebrowser

		String gtitle = driver.getTitle();
		System.out.println("title 3 " + gtitle);

		driver.navigate().forward(); // simulates forward action to the browser

		Thread.sleep(4000);

		driver.navigate().refresh(); // simulates refresh entire Url
	}

}
