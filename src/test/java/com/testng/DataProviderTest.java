package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest {
	
	@Test(dataProvider = "data")
	
	public void demo(String username, String password) {

		System.out.println("username is : " + username);

		System.out.println("password is : " + password);

			}

	@DataProvider
	public Object[][] data() {
		
		return new Object [][] {
			
			
			{"Batamn", "123"},
			
			{"WonderWoman","456"}
	};
	
	

}
}