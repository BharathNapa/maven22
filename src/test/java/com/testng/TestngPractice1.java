package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestngPractice1 {
	
	@Test
	
	public void soft() {
		
		
		String actual = "Bharath";
		
		String expected = "bharath";
				
				SoftAssert s = new SoftAssert();
				
				s.assertEquals(actual, expected);
				
				System.out.println("Verifiaction");
	}

}
