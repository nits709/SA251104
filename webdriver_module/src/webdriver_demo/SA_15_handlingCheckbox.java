package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SA_15_handlingCheckbox extends baseFunctions{
	
	public static void main(String[] args) {
		
		
		launchBrowser("chrome");
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//driver.findElement(By.cssSelector("input[name^='chk_altemail']")).click();
		
		
		//automate checkbox
		
		WebElement checkbox = driver.findElement(By.xpath("//input[starts-with(@name,'chk_altemail')]"));
		
		System.out.println("-----------------BeforeCLick-----------------------");
		
		//1st approach
		System.out.println("displayed "+driver.findElement(By.xpath("//input[starts-with(@name,'chk_altemail')]")).isDisplayed());
		System.out.println("Enabled "+driver.findElement(By.xpath("//input[starts-with(@name,'chk_altemail')]")).isEnabled());
		System.out.println("Selectedd "+driver.findElement(By.xpath("//input[starts-with(@name,'chk_altemail')]")).isSelected());
		
		
		//2nd approach
//		System.out.println("displayed "+checkbox.isDisplayed());
//		System.out.println("Enabled " +checkbox.isEnabled());
//		System.out.println("selected " +checkbox.isSelected()); // unchecked - false
		
		checkbox.click(); // true
		
		
		if(!checkbox.isSelected()) {
			checkbox.click();
		}
		
		System.out.println("-----------------AfterCLick-----------------------");
		
		System.out.println("displayed "+checkbox.isDisplayed()); //true
		System.out.println("Enabled " +checkbox.isEnabled()); //true
		System.out.println("selected " +checkbox.isSelected()); //true
		
		
		
		
		
		driver.close();
		
		
	}

}
