package com.transformer;

import org.testng.Assert;
import org.testng.annotations.Test;


public class TestngPractice2 {
	
	@Test
	public void demo() {
	
	String actual = "Bharath";
	
	String expected = "Bharath";
	
Assert.assertEquals(actual, expected);
	

}

	@Test
	public void demo1() {
		
		String actual = "Bharath";
		
		String expected = "bharath";
		
	Assert.assertEquals(actual, expected);
		
		
	}
	
	
}