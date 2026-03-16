package Assginments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webdriver_demo.baseFunctions;

public class Checkbox_practise extends baseFunctions{
 
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		driver.get("https://demoqa.com/");

		driver.findElement(By.xpath("//div[@class = 'card-body']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//a[@class = 'router-link'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[@class = 'rc-tree-switcher rc-tree-switcher_close']")).click();
		Thread.sleep(4000);
		List<WebElement> checkbox = driver.findElements(By.xpath("//span[@class = 'rc-tree-checkbox']"));
		System.out.println("Count of Checkobox " + checkbox.size());
		System.out.println("--------Intial Status--------");
		for(int i =0; i<checkbox.size(); i++) {
			System.out.println("option selected "+ checkbox.get(i).isSelected());
			System.out.println("option enabled "+ checkbox.get(i).isEnabled());
			System.out.println("option displayed "+ checkbox.get(i).isDisplayed());
		}
		 driver.findElement(By.xpath("//span[@class = 'rc-tree-checkbox']")).click();
		 List<WebElement> checkbox1 = driver.findElements(By.xpath("//span[@class = 'rc-tree-checkbox rc-tree-checkbox-checked']")); 
		Thread.sleep(5000);
		System.out.println("--------After first click Status--------");
		for(int j =0; j<checkbox1.size(); j++) {
		//	checkbox.get(j).click();
		System.out.println("option selected "+ checkbox.get(j).isSelected());
		System.out.println("option enabled "+ checkbox.get(j).isEnabled());
		System.out.println("option displayed "+ checkbox.get(j).isDisplayed());	
	}
	
		driver.close();
 
	}
 
} 