package webdriver_demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automateCalenderElements {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.cssSelector("#datepicker")).click();

		selectDate("13/08/2027");

	}

	
	//MM - 04
	//MMM -Apr
	//MMMM- April
	public static void selectDate(String selectDate) {

		Date current = new Date();
		System.out.println("33 "+current.toString());
		SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

		try {
			Date selected = sd.parse(selectDate);
			
			System.out.println("39  selected "+ selected);
			
			String day = new SimpleDateFormat("dd").format(selected);
			String month = new SimpleDateFormat("MMMM").format(selected);
			String year =new SimpleDateFormat("yyyy").format(selected);
			
			
			System.out.println(" Day "+ day);
			System.out.println(" month "+ month);
			System.out.println(" year "+ year);
			
			String desiredMonthYear = month+" "+year;	
			
			while(true) {
					String displayMonthYear = driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div/div")).getText();
					
					if(desiredMonthYear.equals(displayMonthYear)) {
						driver.findElement(By.xpath("//a[text()='"+day+"']")).click();
					}
					else {
						if(selected.compareTo(current)>0) { 
							driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span")).click();
							
						}else if(selected.compareTo(current)<0) {
							driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click();
						}
					}

					
					
					// 5.compareTo(7) negative -- left
					// 9.compateTo(7) positive -- right
			}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
