package testNG_demo;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TNG_04_UnderBeforeAfter_Test {

	@BeforeTest
	public void OpenBrowser() {
		System.out.println("Open Chrome");
		System.out.println("**************************************************");
	}

	@AfterTest
	public void closeBrowser() {
		System.out.println("CloseBrowser");
	}

	@Test(priority = 1)
	public void openFacebook() {
		System.out.println("Launch facebook URL");
		System.out.println("fetch the title");

		System.out.println("**************************************************");
	}

	@Test(priority = 3)
	public void openMyntra() {
		System.out.println("Launch Myntra URL");
		System.out.println("fetch the title");

		System.out.println("**************************************************");
	}

	@Test(priority = 2)
	public void openGoogle() {
		System.out.println("Launch Google URL");
		System.out.println("fetch the title");

		System.out.println("**************************************************");
	}

}
