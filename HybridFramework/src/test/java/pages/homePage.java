package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import functionLibraries.webdriverFunctions;

public class homePage extends webdriverFunctions {

	public homePage(WebDriver driver) {
		super(driver);

	}

	By signUpLogin = By.xpath("//a[contains(text(),' Signup / Login')]");

	public void clickSignUpLogin() {

		click(signUpLogin);
	}

}
