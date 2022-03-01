package TestNG;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionTest {
	@Test
	public void testurl() {
		 System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		String actualurl="https://www.google.com/";
		driver.navigate().to(actualurl);
		String expectedurl ="https://www.google.com/";
		boolean bool1=  actualurl==expectedurl;
		boolean bool2= true;
		String msg ="test case has not passed";
		Assert.assertFalse(bool2,msg);
		driver.close();
		
		
	}

}
