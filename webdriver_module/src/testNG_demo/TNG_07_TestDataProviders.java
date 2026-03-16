package testNG_demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TNG_07_TestDataProviders {

	@Test(dataProvider = "supplyData")
	public void getData(Object UN, Object pwd, Object contact) {

		System.out.print("| " + UN + " | " + pwd + " | " + contact + " | ");
		System.out.println("");

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
}
