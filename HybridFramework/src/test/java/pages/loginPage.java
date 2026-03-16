package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionLibraries.webdriverFunctions;

public class loginPage extends webdriverFunctions {

	public loginPage(WebDriver driver) {
		super(driver);
		
	}

	By email = By.xpath("//input[@data-qa='login-email']");
	By password = By.xpath("//input[@data-qa='login-password']");
	By loginBtn = By.xpath("//button[@data-qa='login-button']");

	public void login(String user, String pass) {
		type(email, user);
		type(password, user);
		click(loginBtn);
	}
}
