package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Demo {
	
	public class Parameterized {

		@Test @Parameters({"username1" , "password1"})
private void demo(String username1, String password1) {

System.out.println("username is : " + username1);

System.out.println("password is : " + password1);

		}

	}

}