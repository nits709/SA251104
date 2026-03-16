package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class practiceTestAutomaitonSteps {

	WebDriver driver;

	@Given("The user launch application URL {string}")
	public void the_user_launch_application_url(String string) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(string);
	}

	@When("The user enter username {string}")
	public void the_user_enter_username(String string) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(string);
	}

	@When("The user enter password {string}")
	public void the_user_enter_password(String string) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("password")).sendKeys(string);
	}

	@When("The user submit login page")
	public void the_user_submit_login_page() {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("submit")).click();
	}

	@Then("The user validates login succsesfully")
	public void the_user_validates_login_succsesfully() {
		// Write code here that turns the phrase above into concrete actions
		String loginMessage = driver.findElement(By.className("post-title")).getText();
		System.out.println(loginMessage);
	}

}
