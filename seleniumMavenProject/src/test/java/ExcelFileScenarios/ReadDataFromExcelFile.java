package ExcelFileScenarios;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadDataFromExcelFile {

	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow row;
	XSSFCell cell;

	String filepath = "/Volumes/Renuka/TrainingExcelFiles/Book2.xlsx";

	@Test
	public void readDataFromFile() {
		row = sh.getRow(0);
		cell = row.getCell(0);
		System.out.println("--> " + cell.getStringCellValue());

		System.out.println(sh.getRow(1).getCell(0).getStringCellValue());// chain mechnaism
	}

	@Test
	public void getCompleteTable() {

		int totalRows = sh.getPhysicalNumberOfRows(); // total number of rows present in workbook
		int totalCells = sh.getRow(0).getPhysicalNumberOfCells(); // total number of cell present in row

		for (int r = 0; r < totalRows; r++) { // run the rows
			row = sh.getRow(r);

			for (int c = 0; c < totalCells; c++) { //runs for  column
				cell = row.getCell(c);

				System.out.print("| " + cell.getStringCellValue());
			}

			System.out.println("");

		}

	}

	@BeforeTest
	public void setupObjects() throws IOException {
		file = new File(filepath);
		fis = new FileInputStream(file);
		wb = new XSSFWorkbook(fis);
		sh = wb.getSheet("LoginData");
	}

	@AfterTest
	public void closeObject() throws IOException {
		wb.close();
		fis.close();
	}
}
