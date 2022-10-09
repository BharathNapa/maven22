package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngPractice {
	
	@Test
	
	public void hard() {
		
		String expected = "Bharath";
		
		String actual = "bharath";
		
		Assert.assertNotEquals(actual, expected);
				
	   System.out.println("Validation");
	}

}
