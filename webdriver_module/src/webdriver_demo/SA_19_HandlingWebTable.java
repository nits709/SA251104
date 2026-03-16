package webdriver_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SA_19_HandlingWebTable extends baseFunctions {

	public static void main(String[] args) {

		launchBrowser("chrome");
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");

//	// number of elements | findelement | findelements
//	List<WebElement> headers = driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
//	System.out.println("no. of headers "+ headers.size());
//		
//	//how can fetch text of first header
////	System.out.println("text from 1st header "+headers.get(0).getText()); // 1
////	System.out.println("text from 3rd header "+headers.get(2).getText()); //3
////	System.out.println("text from 2nd header "+headers.get(1).getText()); //2
//	
//	for(WebElement wb : headers) {
//		System.out.println("Headers Name "+ wb.getText());
//	}

		// 1. first print total number of rows present in table under tbody.

		List<WebElement> rowSize = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));

		System.out.println("no. of headers " + rowSize.size());

		for (int i = 0; i < rowSize.size(); i++) {
			System.out
					.println(driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+(i+1)+"]/td[1]/a")).getText());
		}

		driver.close();
	}

}
