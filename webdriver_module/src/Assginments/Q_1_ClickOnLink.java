package Assginments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q_1_ClickOnLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		/*
		 * WebElement bestsellersLink =
		 * driver.findElement(By.xpath("//a[text()='Bestsellers']"));
		 * bestsellersLink.click(); driver.close();
		 */

		System.out.println("Hello");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000)");

		// js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println("End");
		// driver.close();

	}

}