package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Grouping {
	
	@Ignore
	
	@Test(groups = "Actors")
	
  public void kamalHasan() {
	  
	  System.out.println("Hey Ram");

}
	
	@Ignore
  
	@Test(groups = "Actors")
	
  public void ajithKumar() {
	  
	  System.out.println("Manakatha");
  }
	
	@Ignore
	@Test(groups = "Actors")
 
  public void vijaySethupathi() {
	  
	  System.out.println("Pizza");
  }
	
@Test(groups = "DC")
	
	public void batman() {

		System.out.println("Christian Bale");
	}

@Test(groups = "DC")
	public void joker() {

		System.out.println("Heath Ledger");
	}


@Test(groups = "DC")
	public void wonderWomen() {

		System.out.println("Gal Gadot");

	}

@Test(groups = "Marvel")

	public void doctorStrange() {
		
		System.out.println("Bendict Cumberbatch");
	}
	
@Test(groups = "Marvel")
	public void captainAmerica() {
		
		System.out.println("Chris Evans");
	}

@Test(groups = "Marvel")
	public void spiderMan() {
		
		System.out.println("Tom Holland");
	}

}
