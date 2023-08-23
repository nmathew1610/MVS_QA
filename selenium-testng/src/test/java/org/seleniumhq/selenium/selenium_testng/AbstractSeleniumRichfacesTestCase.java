package org.seleniumhq.selenium.selenium_testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public abstract class AbstractSeleniumRichfacesTestCase {

   public WebDriver driver;

   @BeforeTest
   public void startWebDriver() {
      System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
      driver = new ChromeDriver(); // Use the appropriate WebDriver instance
   }

   @AfterTest
   public void stopWebDriver() {
      driver.quit();
   }
   
   // Rest of your test methods
}
