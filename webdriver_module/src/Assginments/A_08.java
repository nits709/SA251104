package Assginments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webdriver_demo.baseFunctions;

public class A_08 extends baseFunctions{

	
public static void main(String[] args) {
		
		launchBrowser("chrome");
		driver.get("https://echoecho.com/htmlforms09.htm");
		
		List<WebElement> allcheckbox = driver.findElements(By.xpath("//td[@class='table5']/input"));

		System.out.println("total size of allcheckbox: " + allcheckbox.size());
		
		
		
		for (WebElement checkbox : allcheckbox) {
			if(!checkbox.isSelected()) {
				checkbox.click();
		}
		}
	}
}
