package stepsDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {

	WebDriver driver;

	@Given("The user launch application URL")
	public void the_user_launch_application_url() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.co.in");
	}

	@When("The user enter testdata in search box")
	public void the_user_enter_testdata_in_search_box() {

		WebElement searchElement = driver.findElement(By.name("q"));
		searchElement.sendKeys("Selenium WebDriver");
	}

	@When("The user hit enter from keyword")
	public void the_user_hit_enter_from_keyword() {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("The user validate the search keyword")
	public void the_user_validate_the_search_keyword() {
		System.out.println(driver.getTitle());
		driver.getTitle().contains("Selenium");
	}
}
