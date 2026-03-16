package KeywordLibraries;

import org.apache.poi.xssf.usermodel.XSSFRow;

import KeywordUtilities.ExcelUtilites;

public class ExecutionEngine extends actionKeyword {

	public void executeLogic(String testName) {

		ExcelUtilites eu = new ExcelUtilites();

		System.out.println(eu.getNoOfRows());// total number of rows present inthe file

		for (int row = 1; row < eu.getNoOfRows(); row++) {
			System.out.println("------------------");
			XSSFRow r = eu.sheet.getRow(row);

			String currentTestCaseName = r.getCell(0).getStringCellValue();

			if (!currentTestCaseName.equalsIgnoreCase(testName))
				continue;

			String keyword = r.getCell(1).getStringCellValue();
			String object = r.getCell(2).getStringCellValue();
			String value = r.getCell(3).getStringCellValue();

			System.out.println("currentTestCaseName " + currentTestCaseName);
			System.out.println("keyword " + keyword);
			System.out.println("object " + object);
			System.out.println("value " + value);

			if (keyword.equals("openBrowser")) {
				openBrowser(value);
			} else if (keyword.equals("navigate")) {
				navigate(value);
			} else if (keyword.equals("type")) {
				type(object, value);
			} else if (keyword.equals("click")) {
				click(object);
			} else if (keyword.equals("verifyText")) {
				verifyText(object);
			} else if (keyword.equals("closeBrowser")) {
				closeBrowser();

			}

		}

	}
}
