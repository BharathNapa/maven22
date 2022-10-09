package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG {
	
	@BeforeSuite
	
	private void systemProperty() {

     System.out.println("System Property");
	}
	
	@BeforeTest
	
	public void launchBrowser() {

		System.out.println("Chrome");
	}

	@BeforeClass

	public void lauchUrl() {

		System.out.println("Url");

	}

	@BeforeMethod
 
	public void login() {

		System.out.println("Login");

	}

	@Test(priority = -1)

	public void batman() {

		System.out.println("Christian Bale");
	}

	@Test(priority = -1)

	public void joker() {

		System.out.println("Heath Ledger");
	}

	@Test(invocationCount = 3)

	public void harleyQuinn() {

		System.out.println("Margot Robbie");

	}

	@AfterMethod

	public void logout() {

		System.out.println("Logout");
	}
	
	@AfterClass
	
	public void screenShot() {

   System.out.println("Picture");
   
	}

	@AfterTest
	public void close() {

 System.out.println("Particular tab");
 
	}
	
	@AfterSuite
	
	public void quit() {

System.out.println("Entire Browser");

	}

}
