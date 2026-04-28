package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class base {

	protected WebDriver driver;

	
	@BeforeTest
	public void setUp() {
		System.out.println("@BeforeTest");
		generateExtentReport();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://blazedemo.com/");

	}

	@AfterTest
	public void tearDown() {

		System.out.println("@AfterTest");
		driver.quit();

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

}
