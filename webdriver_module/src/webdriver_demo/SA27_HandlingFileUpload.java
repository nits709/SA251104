package webdriver_demo;

import org.openqa.selenium.By;

public class SA27_HandlingFileUpload extends baseFunctions {

	
	
	//sendkeys
	public static void main(String[] args) {

		String filePath = "/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Reference_SeleniumNoteMaterials/Picture 1.png";
		launchBrowser("chrome");
		launchURL("https://demoqa.com/");

		driver.findElement(By.xpath("//*[@id='root']/div[1]/div/div[2]/div/a[2]/div/div/div[3]")).click();
		driver.findElement(By.xpath("(//*[@id='item-0']/a/span)[2]")).click();
		
		driver.findElement(By.id("uploadPicture")).sendKeys(filePath);

	}

}
