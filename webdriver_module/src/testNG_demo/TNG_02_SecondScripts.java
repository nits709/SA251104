package testNG_demo;

import org.testng.annotations.Test;

public class TNG_02_SecondScripts {

	@Test(priority = 3, groups = "smoke")
	public void setBrowser() {
		System.out.println("LaunchBrowser");
	}

	@Test(priority = 5, groups = "smoke")
	public void setAppURL() {
		System.out.println(" navigate URL");
	}

	@Test(priority = 4, groups = "res")
	public void registeration() {
		System.out.println("do registeration");
	}

	@Test(priority = 1, groups = "login")
	public void login() {
		System.out.println("do Login");
	}

	@Test(priority = 2, groups = "login")
	public void exist() {
		System.out.println("close browser");
	}

}
