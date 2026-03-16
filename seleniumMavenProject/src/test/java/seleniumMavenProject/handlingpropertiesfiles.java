package seleniumMavenProject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class handlingpropertiesfiles {

	String fileName = "/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/Session_WorkSpaces/SA2511004_Workspace"
			+ "/WebDriver_Module/seleniumMavenProject/src/test/resources/testconfiguration.properties";

	Properties prop;
	WebDriver driver;

	@BeforeTest
	public void setupPropsFiles() throws IOException {
		File file = new File(fileName);
		FileInputStream fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);

	}

	@Test
	public void testA() {
		System.out.println("browserName " + prop.getProperty("browserName"));
		driver = new ChromeDriver();
		driver.get(prop.getProperty("appURL"));
		
	}

}
