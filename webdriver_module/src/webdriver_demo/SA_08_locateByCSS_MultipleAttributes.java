package webdriver_demo;

import org.openqa.selenium.By;

public class SA_08_locateByCSS_MultipleAttributes extends baseFunctions {

	public static void main(String[] args) {

		launchBrowser("chrome");

		driver.get("https://www.echotrak.com/Login.aspx?ReturnUrl=%2f");

		driver.findElement(By.cssSelector("input[class='form-control'][id='txtCustomerID']"))
		.sendKeys("nitin");
		
		driver.findElement(By.cssSelector("input[class='form-control'][id='txtPassword']"))
		.sendKeys("nitin");
		
		driver.findElement(By.cssSelector("input[name='Butsub'][title='Login']")).click();
		
		
		sleep(); // wait for 4 seconds
		 	// i want to see the complete execution.
		
		driver.close();
		

}
}