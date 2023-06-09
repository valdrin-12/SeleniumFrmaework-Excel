package testcase;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.BaseTest;

public class MyFirsTestFW extends BaseTest {
	@Test(dataProvider="testdata")
	public static void LoginTest(String username,String password) throws InterruptedException{
	  driver.findElement(By.id(loc.getProperty("login"))).sendKeys("vq41669@ubt-uni.net");
      driver.findElement(By.id(loc.getProperty("nextbutton"))).click();
      
     driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Valtonqerimi.com");

      //driver.findElement(By.cssSelector("#nextbtn")).click();
	}
	
	@DataProvider(name="testdata")
	public Object[][] tData(){
		return new Object[][] {
			
			{"rc2gmail.com","test@hghghg"},
			{"rc2gmail.com","test@hghghg"},
			{"vq41669@ubt-uni.net","Valtonqerimi.com"},

			
		};
		
		
		
		
		
	}
}
