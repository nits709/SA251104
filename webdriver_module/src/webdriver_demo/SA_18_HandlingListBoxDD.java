package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SA_18_HandlingListBoxDD extends baseFunctions {

	public static void main(String[] args) {

		launchBrowser("chrome");
		driver.get("https://omayo.blogspot.com/");

		Select sc = new Select(driver.findElement(By.id("multiselect1")));

		System.out.println("Total value size " + sc.getOptions().size());

		List<WebElement> mb = sc.getOptions();
		for (WebElement mbox : mb) {
			System.out.println(mbox.getText());

		}

		sc.selectByVisibleText("Audi"); // actual index of this 3
		sleep();
		sc.selectByIndex(2); // hyndai

		// deselect all options.
		sc.deselectByIndex(3); // deselects Audi

		sleep();
		sc.selectByIndex(1); // swift

		sleep();
		sc.selectByVisibleText("Volvo");

		// deselect all value in single go
		sc.deselectAll();

		sleep();
		driver.close();
	}
}
