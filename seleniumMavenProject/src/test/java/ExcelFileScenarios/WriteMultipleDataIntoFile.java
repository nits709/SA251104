package ExcelFileScenarios;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WriteMultipleDataIntoFile {

	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow row;
	XSSFCell cell;

	
	@Test
	public void writeMultipleData() {
		
		// first row data
		row = sh.createRow(0); // create a row inside sheet at zero index.
		cell = row.createCell(0); // create cell inside row at zero index
		cell.setCellValue("Selenium");
		
		//row = sh.createRow(0); // create a row inside sheet at zero index.
		cell = row.createCell(1); // create cell inside row at zero index
		cell.setCellValue("WebDriver");
		
		
		
		//second row data
		row = sh.createRow(1); // create a row inside sheet at zero index.
		cell = row.createCell(0); // create cell inside row at zero index
		cell.setCellValue("Playwright");
		
		cell = row.createCell(1); 
		cell.setCellValue("JS");
		
		
	}

	
	
	@BeforeTest
	public void setupObjects() throws FileNotFoundException {
		file = new File("myMultipleDataExcel.xlsx");
		fos = new FileOutputStream(file);
		wb = new XSSFWorkbook();
		sh = wb.createSheet("myFirstSheet");

	}

	@AfterTest
	public void closeObject() throws IOException {

		wb.write(fos); // this function important to call write physical data into file.

		wb.close();
		fos.close();
	}
}
