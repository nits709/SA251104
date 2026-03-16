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
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLoginTestData {

	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow row;
	XSSFCell cell;
	int index = 0;

	@Test(dataProvider = "supplyData")
	public void getAndWriteDataIntoFile(String un, String pwd, String contact) {

		// row first
		row = sh.createRow(index); // creates row

		cell = row.createCell(0); // create cell at 0 index
		cell.setCellValue(un);

		cell = row.createCell(1); // create cell at 1 index
		cell.setCellValue(pwd);

		cell = row.createCell(2); // create cell at 2 index
		cell.setCellValue(contact);

		index++;
	}

	@DataProvider
	public Object[][] supplyData() {

		Object[][] data = new Object[4][3]; // row, column

		// data row 1, 0

		data[0][0] = "Username";
		data[0][1] = "Password";
		data[0][2] = "Contact";

		// data row 2
		data[1][0] = "Nitin";
		data[1][1] = "@@@@@";
		data[1][2] = "123456789";

		// row 3
		data[2][0] = "John";
		data[2][1] = "*****";
		data[2][2] = "987654321";

		// row 4
		data[3][0] = "Ketaki";
		data[3][1] = "UUYTREW";
		data[3][2] = "43454756";

		return data;
	}

	@BeforeTest
	public void setupObjects() throws FileNotFoundException {
		file = new File("myFirstExcel.xlsx");
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
