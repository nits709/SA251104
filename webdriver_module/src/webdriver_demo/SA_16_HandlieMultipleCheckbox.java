package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SA_16_HandlieMultipleCheckbox extends baseFunctions {

	// css -input[type='checkbox'][name='accessories'] -- 4
	// xpath - //input[@name='accessories'] --4
	// xpath - //input[@value='Laptop']
	// xpath - based on index --- (//input[@value='Pen'])[2]
	public static void main(String[] args) {

		launchBrowser("chrome");

		driver.get("https://omayo.blogspot.com/");

		// driver.findElement(By.xpath("//input[@value='Laptop']")).click();
		// driver.findElement(By.xpath("(//input[@value='Pen'])[2]")).click();

		List<WebElement> accessoriesCheckbox = driver.findElements(By.xpath("//input[@name='accessories']"));
		System.out.println("total size of accessoriesCheckbox " + accessoriesCheckbox.size());

		for (int i = 0; i < accessoriesCheckbox.size(); i++) {
			accessoriesCheckbox.get(i).click();
		}

		sleep();
		driver.close();
	}

}
