package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleLinksSteps {

	WebDriver driver;

	@Before
	public void setupBrowser() {
		driver = new ChromeDriver();
	}

	@Given("I open google page {string}")
	public void i_open_google_page(String string) {
		// Write code here that turns the phrase above into concrete actions

		driver.manage().window().maximize();
		driver.get(string);
	}

	@When("I click on Gmail")
	public void i_click_on_gmail() {
		WebElement gmailElement = driver.findElement(By.linkText("Gmail"));
		gmailElement.click();
	}

	@Then("I validate Gmail Page")
	public void i_validate_gmail_page() {
		System.out.println("---> Title " + driver.getTitle());
	}

	
	@When("I close the browser")
	public void i_close_the_browser() {
		// Write code here that turns the phrase above into concrete actions
		driver.quit();
	}

	@When("I click on Images")
	public void i_click_on_images() {
		// Write code here that turns the phrase above into concrete actions
		WebElement imageElement = driver.findElement(By.linkText("Images"));
		imageElement.click();
	}

	@Then("I validate Image Page")
	public void i_validate_image_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("---> Title " + driver.getTitle());
	}

	@When("I click on adver")
	public void i_click_on_adver() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.linkText("Advertising")).click();
	}

	@Then("I validate adv Page")
	public void advPage() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("---> Title " + driver.getTitle());
	}

}
