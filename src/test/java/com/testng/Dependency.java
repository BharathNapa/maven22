package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Dependency {
	
   @Test @Ignore
	
	public void hallTicket() {

System.out.println("A7689UI");
	}
	
	@Test(dependsOnMethods = "hallTicket")
	
	public void examHall() {


		System.out.println("KCS");
	}

}
