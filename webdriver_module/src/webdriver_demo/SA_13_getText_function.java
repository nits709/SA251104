package webdriver_demo;

import org.openqa.selenium.By;

public class SA_13_getText_function extends baseFunctions{

	public static void main(String[] args) {
		launchBrowser("chrome");
		driver.get("https://autotestacademy.com/#/auth");
		
		
		//username
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("nitin@gmail.comn");
		
		//password
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("2345678okjhgfde");
		
		//login
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
		//fetch text from application
		
		String loginError = driver.findElement(By.
				xpath("//div[@class='p-4 bg-rose-50 text-rose-600 text-xs font-bold rounded-xl "
						+ "border border-rose-100 flex items-center gap-2']")).getText();
		
		System.out.println("text from page "+ loginError);
		
		if(loginError.contains("Invalid")) {
			System.out.println("testcases failed");
		}
		
		

	}

}
