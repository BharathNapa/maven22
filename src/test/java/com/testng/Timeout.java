package com.testng;

import org.testng.annotations.Test;

public class Timeout {
	
	@Test(timeOut = 7000)
	public void timeOut() throws InterruptedException {
		
Thread.sleep(2000);
System.out.println("Batman");

Thread.sleep(2000);
System.out.println("Joker");

Thread.sleep(2000);
System.out.println("Bane");
	}

}
