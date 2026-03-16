package KeywordUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilites {

	String filePath = "/Volumes/Renuka/Professional Stuff (Restricted)/Session_material/"
			+ "Session_WorkSpaces/SA2511004_Workspace/WebDriver_Module/keywordDriven/src/test/java/testData/LoginTestData.xlsx";

	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	public XSSFSheet sheet;
	public XSSFRow row;

	public ExcelUtilites() {
		setUpObjects();
		getNoOfRows();
		closeObject();
	}

	public void setUpObjects() {
		try {
			file = new File(filePath);
			fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
			sheet = wb.getSheet("LoginData");
		} catch (Exception e) {
			e.getMessage();
		}

	}

	public int getNoOfRows() {
		return sheet.getPhysicalNumberOfRows(); // number of rows in integer
	}

	public void closeObject() {
		try {
			wb.close();
			fis.close();
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
