package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftAssert {
	
	@Test
	public void titleTest() 

	{
		SoftAssert softassert =new SoftAssert();
		String expectedtitle= "Electronics, Cars, Fashion, Collectibles & More | eBay";
		String expectedtext= "Search";

		 System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.get("https://www.ebay.com/");
		 String actualtitle= driver.getTitle();
		 System.out.println("verifyling title");
		 softassert.assertEquals(actualtitle,expectedtitle,"Title verification failed");
		 
		 String actualtext=driver.findElement(By.xpath("//input[@id='gh-btn']")).getAttribute("value");
		 System.out.println("verifyling text");
		 softassert.assertEquals(actualtext,expectedtext,"text verification failed");

		 System.out.println("closing browser");
		 driver.close();
		 softassert.assertAll();
	}


}
