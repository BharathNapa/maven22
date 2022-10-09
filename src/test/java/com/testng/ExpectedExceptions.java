package com.testng;

import org.testng.annotations.Test;

public class ExpectedExceptions {
	
	
	
//	private void demo() {
//
//		int a = 30;
//		
//		System.out.println(a/0);
//	}

	@Test(expectedExceptions = NullPointerException.class )
	
	public void string() {

     String s = null;
     
     int length = s.length();
     
     System.out.println(length);
	}
	
	
	
}
