package KeywordUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class configProperties {

	static Properties prop;

	public configProperties() {
		getProperties();
	}

	public void getProperties() {
		try {
			FileInputStream fis = new FileInputStream("src/test/java/testData/OR.properties");
			prop = new Properties();
			prop.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getProValue(String value) {
		return prop.getProperty(value);

	}
}
