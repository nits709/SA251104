package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SA_29_HandlingMouseOperations extends baseFunctions {

	public static void main(String[] args) {

		launchBrowser("chrome");
		launchURL("https://www.istqb.in/");

		// Foundation // hovering on foundation
		// WebElement foundation =
		// driver.findElement(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[3]/span"));

		List<WebElement> istqbMenus = driver.findElements(By.xpath("//*[@id='sp-menu']/div/nav/ul/li")); // 8

		Actions ac = new Actions(driver);// action class accepts the webdriver object

		for (int i = 0; i < istqbMenus.size(); i++) {

			sleep();
			String textONElement = istqbMenus.get(i).getText();
			System.out.println("text " + textONElement);
			ac.moveToElement(istqbMenus.get(i)).build().perform();

		}
		// CORPORATE EXAMS
		// driver.findElement(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[3]/div/div/div/div[1]/ul/li[7]/a")).click();
	}

}
