package stepsDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleTitleSteps {

	
	
	@Given("The user launch google URL")
	public void userLaunchGoogleURL() {
		System.out.println("URL is calling");
	}
	
	@When("The user reads page title")
	public void userReadPageTitle() {
		System.out.println("reading page title");
	}
	
	@Then("The use validate page title")
	public void userValidatesPageTitle() {
		System.out.println("Page title validates");
	}
	
	
	
	
	
}
