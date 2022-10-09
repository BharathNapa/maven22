package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Parallel {
	
	public static WebDriver driver;
	
	@Test 
	
	public void batman() {
		
		System.out.println("Christain Bale" + " "+ Thread.currentThread().getId());
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		
		 driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");

	}
	
	@Test
	
	public void wonderWoman() {

System.out.println("Gal Gadot"+ " " +  Thread.currentThread().getId());


System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");

 driver = new ChromeDriver();

driver.get("https://www.youtube.com/");
	}

}
