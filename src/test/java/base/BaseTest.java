package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class BaseTest {
	public static WebDriver driver;
	public static Properties prop=new Properties();
	public static Properties loc=new Properties();

	public static FileReader fr;
	public static FileReader fr1;

	//@BeforeMethod
//	@BeforeTest
	@BeforeMethod 
	public void setUp() throws IOException {
		
		if(driver==null) {
			
			 fr=new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/Config.properties");
			 fr1=new FileReader(System.getProperty("user.dir")+"/src/test/resources/configfiles/locators.properties");

			prop.load(fr);
			loc.load(fr1);
		}
		if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
			
			
			WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
			 
			 driver.get(prop.getProperty("testurl"));
		        driver.get("https://accounts.zoho.com/signin?servicename=ZohoHome&signupurl=https://www.zoho.com/signup.html&serviceurl=https://www.zoho.com/all-products.html&ireft=nhome&src=home1-header");

			
		}else if (prop.getProperty("browser").equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();
			 driver.get(prop.getProperty("testurl"));

			
		}
		
	}
	@AfterMethod
	// @AfterTest
	public void tearDown() {
		
		driver.close();
		System.out.println("Tear down succesful");
		
		
	}

}
