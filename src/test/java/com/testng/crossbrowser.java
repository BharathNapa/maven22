package com.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
	
	public static WebDriver driver;
	
	@BeforeTest
	
	@Parameters("browserName")
	
	public void setUp(String browserName) {
		
		if(browserName.equalsIgnoreCase("chrome")){
			
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
			
			 driver = new ChromeDriver();
			
		}
		
		else if(browserName.equalsIgnoreCase("firefox")){
			
		
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Driver//geckodriver.exe");
			
			 driver = new FirefoxDriver();
			
		}

		else if(browserName.equalsIgnoreCase("edge")){
	
	
	System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Driver//msedgedriver.exe");
	
	 driver = new EdgeDriver();
	
}

if(browserName.equalsIgnoreCase("ie")){
	
	
	System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"//Driver//IEDriverServer.exe");
	
	 driver = new InternetExplorerDriver();
	
}



		
	}
	
	@Test

	public void  urlLaunch () {
		
		driver.get("https://www.google.com/");
	}

//	@AfterTest
//	
//	public void tearDown() throws InterruptedException {
//		
//		Thread.sleep(5000);
//		
//		driver.close();
//		
//	}
}
