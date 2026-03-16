package testNG_demo;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TNG_05_BeforeMethodAfterMethod {

	@BeforeMethod
	public void openBrowser() {
		System.out.println("OpenBrowser");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Close browser");
	}

	@Test
	public void testFacebook() { // chrome
		System.out.println("Open URL");
	}

	@Test
	public void testMyntra() { // firefox
		System.out.println("Open URL");
	}

	@Test
	public void testGoogle() { // safari
		System.out.println("Open URL");
	}

}
