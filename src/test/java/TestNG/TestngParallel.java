package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngParallel {
	
	WebDriver driver = null;

	@BeforeTest
	public void setUpTest() {
		System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
		driver= new ChromeDriver();
	}
	
   @Test
   public void googleSearch() {
	   
	   driver.get("https://www.google.com");
	   driver.findElement(By.name("q")).sendKeys("Automation ");
	  // driver.findElement(By.name("btnK")).click();
   }
   @Test
   public void googleSearch1() {
	   
	   driver.get("https://www.google.com");
	   driver.findElement(By.name("q")).sendKeys("selenium ");
	  // driver.findElement(By.name("btnK")).click();
   }
   
   @AfterTest
   public void tearDown() {
	   driver.quit();
   }
   
   }
  
