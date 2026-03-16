package testcases;

import org.testng.annotations.Test;

import KeywordLibraries.ExecutionEngine;

public class loginTestcases {

	ExecutionEngine e = new ExecutionEngine();

	
	@Test
	public void test() {
		e.executeLogic("Login");
	}
}
