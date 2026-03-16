package webdriver_demo;

import org.openqa.selenium.By;

public class SA_06_echoTrack_className extends baseFunctions {

	public static void main(String[] args) {

		launchBrowser("chrome");

		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

		driver.findElement(By.className("form-control")).sendKeys("username");

		driver.findElement(By.name("txtPassword")).sendKeys("password");
	}
}
