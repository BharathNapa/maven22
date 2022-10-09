package com.testng;

import org.testng.annotations.Test;

public class Ignore {
	
	@Test
	
	public void batman() {

		System.out.println("Christian Bale");
	}

@Test
	public void joker() {

		System.out.println("Heath Ledger");
	}

@Test

	public void wonderWomen() {

		System.out.println("Gal Gadot");

	}

@org.testng.annotations.Ignore

@Test

	public void doctorStrange() {
		
		System.out.println("Bendict Cumberbatch");
	}
	
@Test 

	public void captainAmerica() {
		
		System.out.println("Chris Evans");
	}

@Test(enabled = false)
	
	public void spiderMan() {
		
		System.out.println("Tom Holland");
	}
}
