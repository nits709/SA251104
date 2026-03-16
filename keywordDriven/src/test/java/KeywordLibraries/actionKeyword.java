package KeywordLibraries;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;

import KeywordUtilities.configProperties;

public class actionKeyword extends configProperties {

	public WebDriver driver;

	public void openBrowser(String browserName) {
		if (browserName.equals("chrome")) {

			driver = new ChromeDriver();

		} else if (browserName.equals("firefox")) {

			driver = new FirefoxDriver();

		} else if (browserName.equals("safari")) {

			driver = new SafariDriver();

		} else if (browserName.equals("edge")) {

			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	public void navigate(String url) {
		driver.get(url);
	}

	public void type(String locator, String testData) {
		driver.findElement(By.id(getProValue(locator))).sendKeys(testData);
	}

	public void click(String locator) {
		driver.findElement(By.id(getProValue(locator))).click();
	}

	public void closeBrowser() {
		driver.quit();
	}

	// Congratulations student. You successfully logged in!
	public void verifyText(String locators) {
		//driver.findElement(By.xpath(locators));
		String actualText = driver.findElement(By.xpath(getProValue(locators))).getText();
		System.out.println("actualText " + actualText);
		Assert.assertEquals(actualText, getProValue("LoginMsg"), "Verification fails, please verify");
	}

}
