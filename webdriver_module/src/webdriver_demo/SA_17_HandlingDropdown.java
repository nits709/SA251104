package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SA_17_HandlingDropdown extends baseFunctions{
	
	//v important for interview.
	public static void main(String[] args) {
		
		launchBrowser("chrome");
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement countryDD = driver.findElement(By.id("country")); // dropdown locator
		
		Select sc = new Select(countryDD); // sc class method executes on countryDD
		
		
	// default option from DD	
	//System.out.println("default | selected country "+ sc.getFirstSelectedOption().getText());
	
	//getOptions based on index
	
//	System.out.println(" get option "+ sc.getOptions().get(0).getText()); // country value - 99 | index 0
//	System.out.println(" get option "+ sc.getOptions().get(20).getText());
//	System.out.println(" get option "+ sc.getOptions().get(11).getText());
	
	
	// print the size of options 
	
	//System.out.println("size of DD "+ sc.getOptions().size());
	
//	List<WebElement> options= sc.getOptions();
//	
//	for(WebElement ddOption:options) {
//		//System.out.println("get text from option "+ ddOption.getText());
//		
//	}
	
	
	// select value option from DD using visible text
	
	System.out.println("default | selected country "+ sc.getFirstSelectedOption().getText());
	sc.selectByVisibleText("Canada");
	System.out.println("new | selected country "+ sc.getFirstSelectedOption().getText());
	
	
	sleep();
	
	//select option from DD using value attribute.
	
	sc.selectByValue("29"); // Brazil
	
	
	sleep();
	// select option from DD using by index
	sc.selectByIndex(0); // India
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
	}

}
