package webdriver_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SA_02_ReadPageTitle {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
	
		driver.get("https://google.co.in");
		driver.manage().window().maximize();

		String pageTitle = driver.getTitle(); // fetch the page Title.

		String pageURL = driver.getCurrentUrl(); // reutrn the currentpage URL
		System.out.println(" page Title " + pageTitle);
		
		System.out.println("Page URL "+ pageURL);

		if (pageTitle.equals("Amazon")) {
			System.out.println("testcase passed");
		} else {
			System.out.println("testcase failed");
		}

		driver.close();

	}

}
