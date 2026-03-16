package Assginments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import webdriver_demo.baseFunctions;

public class checkbox extends baseFunctions {
	public static void main(String[] args) throws InterruptedException {
		launchBrowser("chrome");
		driver.get("https://demoqa.com/");
		driver.findElement(By.xpath("//div[@class = 'card-body']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"item-1\"]/a/span")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/span[2]"))
				.click(); // jsclick
		Thread.sleep(5000);
		List<WebElement> checkboxlist = driver.findElements(
				By.xpath("//*[@id=\"root\"]/div/div/div/div[2]/div[1]/div/div[3]/div/div/div/div/span[3]"));
		Thread.sleep(5000);
		System.out.println("Checkbox list are" + checkboxlist.size());
	}
}