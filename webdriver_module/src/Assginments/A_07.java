package Assginments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webdriver_demo.baseFunctions;

public class A_07 extends baseFunctions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//div[@role='presentation']/div/div/ul/li/div/div[2]/div/div/span - 50
		//div[@role='presentation']/div/div/ul/li/div/div[2]/div[1]/div[1]/span -- return the text of each list.
		
		////div[@role='presentation']/div/div/ul/li - return the list count of google search
		
		//div[@role='presentation']/div/div/ul/li/div/div[2]/div/div/span - 1st list of google search
		//*[@id="jZ2SBf"]/div[1]/span - relative
		//*[@id="ERWdKc"]/div[1]/span
		//*[@id="c7mM1c"]/div[1]/span
		
		//div[@role='presentation']/div/div/ul/li/div/div[2]/div[1]/div[1]/span
		
		
		
		
		
		
		
//absolute -/html/body/div[2]/div[4]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/ul/li[1]/div/div[2]/div[1]/div[1]/span
		
		
		launchBrowser("chrome");
		
		driver.get("https://www.google.co.in");
		
		driver.findElement(By.name("q")).sendKeys("Sachin");
		List<WebElement> searchCount = driver.findElements(By.xpath("//div[@role='presentation']/div/div/ul/li/div/div[2]/div[1]/div[1]/span"));
		System.out.println("number of links present in search List "+ searchCount.size());
		
		
		for(int i=0;i<searchCount.size();i++) {
			System.out.println("Text of each suggestion "+ searchCount.get(i).getText());
		}
		
		
		
		
		
   

	}

}
