package testNG_demo;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import webdriver_demo.baseFunctions;

public class TNG_08_DataProviderDemo extends baseFunctions {

	@Test(dataProvider = "supplyData")
	public void loginTestwithData(Object un, Object pwd) { // have test code
		launchBrowser("chrome");
		launchURL("https://practicetestautomation.com/practice-test-login/");
		// validate login functionality
		driver.findElement(By.id("username")).sendKeys(String.valueOf(un));
		driver.findElement(By.id("password")).sendKeys(String.valueOf(pwd));
		driver.findElement(By.id("submit")).click();
		// below ensure userloggedin or not
		String loginMsg = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"))
				.getText();
		System.out.println("message " + loginMsg);
		// logout the user
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

		quiteBrowser();
	}

	@DataProvider
	public Object[][] supplyData() {

		Object[][] data = new Object[4][2]; // row, column

		// data row 1, 0

		data[0][0] = "student";
		data[0][1] = "Password123";

		// data row 2
		data[1][0] = "student";
		data[1][1] = "Password123";

		// row 3
		data[2][0] = "student";
		data[2][1] = "Password123";

		// row 4
		data[3][0] = "student";
		data[3][1] = "Password123";

		return data;
	}
}
