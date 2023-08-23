package org.seleniumhq.selenium.selenium_testng;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testSearch extends Base {
	
	
	
	@Test()
	public void searchActiveSync() throws InterruptedException {
        driver.findElement(By.id("L2AGLb")).click();
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Active sync");
        searchBox.submit();
        Thread.sleep(3000);
        WebElement firstLink = driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md' or @text='ActiveSync']"));
        firstLink.click();
       //String  title = driver.getTitle();
       //System.out.println(title);
        
        //verify that title of the opened page has ACTIVE SYNC " 
       WebElement pageHeading = driver.findElement(By.id("firstHeading"));
       String actualHeading = pageHeading.getText();
       String expectedHeading = "ActiveSync";
       Assert.assertEquals(actualHeading, expectedHeading, "testPassed");
        
        
        		
    }
}
