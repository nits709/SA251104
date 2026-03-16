package stepsdefinition;

import org.openqa.selenium.WebDriver;

import functionLibraries.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.homePage;
import pages.loginPage;

public class loginSteps {

	WebDriver driver = DriverFactory.getDriver();
	loginPage lp;
	homePage hp;

	@Given("user is on homepage")
	public void user_is_on_homepage() {
		hp = new homePage(driver);
	}

	@When("user clicks on singup login")
	public void user_clicks_on_singup_login() {
		hp.clickSignUpLogin();
	}

	@When("user enter email and password")
	public void user_enter_email_and_password() {
		lp = new loginPage(driver);
		lp.login("testin@gmail.com", "pass");

	}

	@Then("user login should be successfully")
	public void user_login_should_be_successfully() {

	}
}
