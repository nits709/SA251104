package webdriver_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SA_01_LaunchChromeBrowser {

	public static void main(String[] args) {
		// cntrl/cmd+shift + O || shortcut keys to imports
//		WebDriver driver = new ChromeDriver(); // chrome browser
//		WebDriver driver1 = new FirefoxDriver(); // firefoxbrowser

		// ChromeDriver driver = new ChromeDriver(); /// class in selenium
		WebDriver dr = new ChromeDriver();
		dr = new FirefoxDriver();
		dr.get("https://www.google.co.in"); // launch the URL
		dr.manage().window().maximize(); // maximized the open browsers
		dr.close(); // closed the open browser.

	}

}
