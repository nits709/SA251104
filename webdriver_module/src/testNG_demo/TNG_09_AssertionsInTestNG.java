package testNG_demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TNG_09_AssertionsInTestNG {

	
	
	@Test
	public void testA() {
		
//		System.out.println("test1");
//		Assert.assertTrue(2>=2); //pass // asserting the condition, if condition is true then pass else fail
//		//Assert.assertTrue(2>=4); // fails here, and stop the execution
//		System.out.println("test2");
//		Assert.assertEquals("Nitin","Nitin"); // asserting the values, if both are same then pass else fail
//		System.out.println("test3");
//		//Assert.assertEquals("Nitin","sachin"); // fails here, and stop the execution
//		Assert.assertNotEquals("Nitin","Sachin"); //
//		System.out.println("test4");
//		System.out.println("test5");
				
//				String pagTitle = driver.getTitle();
//				Assert.assertEquals(pagTitle, "Google"); // if page title is Google then pass else fail
		
		
		
		SoftAssert softAssert = new SoftAssert();
		System.out.println("test1");
		softAssert.assertTrue(2>=2);
		System.out.println("test2");
		softAssert.assertTrue(2>=4); 
		System.out.println("test3");
		System.out.println("test4");
		softAssert.assertEquals("Selenium","WebDriver");
		 System.out.println("test5");
		System.out.println("test5");
		
		softAssert.assertAll(); // to check all the assertions, if any assertion is failed then it will mark the test case as failed
		
		
		
		
}
}
