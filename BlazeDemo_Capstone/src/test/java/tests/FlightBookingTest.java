package tests;

import org.testng.annotations.Test;

import pages.HomePage;
import pages.ReservePage;
import utils.base;

public class FlightBookingTest extends base {

	//this is assignment for you guys
	
	HomePage hp;
	ReservePage rs;

	@Test(priority = 1, groups = "smoke")
	public void TC_01() {
		hp = new HomePage(driver);
		hp.verifyHomePage();

	}

	@Test(priority = 2, groups = "functional")
	public void TC_02() {
		hp = new HomePage(driver);
		hp.searchFlight("Boston", "New York");
	}

	@Test(priority = 3, groups = "functional")
	public void TC_03() {
		rs = new ReservePage(driver);
		rs.selectFlight("Lufthansa");

	}
}
