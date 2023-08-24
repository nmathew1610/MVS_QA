package org.seleniumhq.selenium.selenium_testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Base {
	protected WebDriver driver;
	//Setting up firefox driver
	@BeforeClass
	public void setUpMethod( ) {
	System.setProperty("webdriver.gecko.driver", "/Users/nmathew/Desktop/geckodriver");
        driver = new FirefoxDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
       
	}
	
	//Closing the driver 
	@AfterClass 
	public void tearDownMethod( ) {
		if (driver != null) {
            driver.quit();
        }
	}     
	
}
