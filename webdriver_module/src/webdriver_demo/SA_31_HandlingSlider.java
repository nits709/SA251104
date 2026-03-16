package webdriver_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SA_31_HandlingSlider extends baseFunctions {

	public static void main(String[] args) {
		launchBrowser("chrome");
		launchURL("https://jqueryui.com/slider/");

		Actions ac = new Actions(driver);

		driver.switchTo().frame(0);

		WebElement slider = driver.findElement(By.xpath("//*[@id='slider']/span"));

		System.out.println("x Axis " + slider.getLocation().x);
		System.out.println("y Axis " + slider.getLocation().y);

		ac.dragAndDropBy(slider, slider.getLocation().x + 500, slider.getLocation().y).build().perform();

		System.out.println("x Axis " + slider.getLocation().x);

	}

}
