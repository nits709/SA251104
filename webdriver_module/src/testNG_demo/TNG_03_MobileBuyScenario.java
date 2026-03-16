package testNG_demo;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TNG_03_MobileBuyScenario {

	boolean flag = true;

	@Test(priority = 1)
	public void searchMobile() {

		if (flag) {
			throw new SkipException("skipping the testcase");
		}
		System.out.println("searching the phone......");
	}

	@Test(priority = 2, dependsOnMethods = { "searchMobile" })
	public void selectPhoneAddToCart() {
		System.out.println("Adding Mobile to Cart...........");
	}

	@Test(priority = 3, dependsOnMethods = { "searchMobile", "selectPhoneAddToCart" })
	public void CheckoutProduct() {
		System.out.println(" checking out the product......");
	}

}
