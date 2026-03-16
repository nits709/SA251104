package testNG_demo;

import org.testng.annotations.Test;

import webdriver_demo.baseFunctions;

// testng is not coming bydefault with eclipse
// need to integrate with code editor - eclipse
public class TNG_01_FirstScript extends baseFunctions {

	// testNG doesnot have main method

	@Test
	public void testA() {
		System.out.println("A");
	}

	@Test
	public void testB() {
		System.out.println("B");
	}

	@Test
	public void testC() {
		System.out.println("C");
	}

	@Test
	public void testD() {
		System.out.println("D");
	}

}
