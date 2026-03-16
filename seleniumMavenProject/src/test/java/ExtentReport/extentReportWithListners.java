package ExtentReport;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class extentReportWithListners {

	WebDriver driver;
	ExtentSparkReporter htmlReport;
	ExtentReports report;
	ExtentTest test1;

	@Test(priority = 1)
	public void loginTestwithData() { // have test code
		// validate login functionality
		test1 = report.createTest("Login test with valid testData");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.id("submit")).click();
		// below ensure userloggedin or not
		String loginMsg = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"))
				.getText();
		System.out.println("message " + loginMsg);
		// logout the user
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

	}

	@Test(priority = 2)
	public void loginTestwithInvaData() { // have test code
		// validate login functionality
		test1 = report.createTest("Login Test with invalid testData");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password");
		driver.findElement(By.id("submit")).click();
		// below ensure userloggedin or not
		String loginMsg = driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/p[1]/strong"))
				.getText();
		System.out.println("message " + loginMsg);
		// logout the user
		driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[2]/div/div/div/a")).click();

	}

	@Test(priority = 3)
	public void loginTestwithskipData() { // have test code
		// validate login functionality
		test1 = report.createTest("skipping testcases");
		throw new SkipException("skipping my testcases to log into report");

	}

	@BeforeTest
	public void generateExtentReport() {
		htmlReport = new ExtentSparkReporter("AutomationReport.html");

		report = new ExtentReports();
		report.attachReporter(htmlReport);

		// ExtentTest test1;
		// added some environment infor to report.
		report.setSystemInfo("ProjectName", "Automation Project");
		report.setSystemInfo("Machine", "Mac");
		report.setSystemInfo("Company", "Star Agile");
		report.setSystemInfo("User", "Automation user");
		report.setSystemInfo("Browser", "Chrome");
		report.setSystemInfo("Tool", "Selenium Webdriver");

		// configuration to report
		htmlReport.config().setDocumentTitle("My Automation Extent Report");
		htmlReport.config().setReportName("Selenium Report");
		htmlReport.config().setTheme(Theme.DARK);
		htmlReport.config().setTimeStampFormat("dd-MMMM-YYYY");

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://practicetestautomation.com/practice-test-login/");

	}

	@AfterMethod
	public void integrateLisnters(ITestResult result) {
		// ITestResult will give you detailed information about the @Test

		if (result.getStatus() == ITestResult.SUCCESS) {
			test1.log(Status.PASS, MarkupHelper.createLabel(result.getName(), ExtentColor.GREEN));
		} else if (result.getStatus() == ITestResult.FAILURE) {
			test1.log(Status.FAIL, MarkupHelper.createLabel(result.getName(), ExtentColor.RED));
			test1.fail(result.getThrowable()); // getThrowable() will get the failure log
			String screenShotPath = captureScreenShot(result.getName());
			test1.addScreenCaptureFromPath(screenShotPath);
		} else if (result.getStatus() == ITestResult.SKIP) {
			test1.log(Status.SKIP, MarkupHelper.createLabel(result.getName(), ExtentColor.ORANGE));
			test1.skip(result.getThrowable());
		}
	}

	public String captureScreenShot(String testname) {

		String fileDestination = System.getProperty("user.dir") + "/screenshot/" + testname + ".png";
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);

		File des = new File(fileDestination);
		try {
			FileHandler.copy(source, des);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return fileDestination;
	}

	@AfterTest
	public void releaseObjects() {
		report.flush();
		driver.quit();
	}

}
