package test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	public static void main(String[]args) throws Exception{

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://demo.opencart.com/");
	     driver.manage().window().maximize();
	     WebElement desktop=  driver.findElement(By.xpath("//body/div[1]/nav[1]/div[2]/ul[1]/li[1]/a[1]"));
	     Thread.sleep(2000);
	     WebElement mac=  driver.findElement(By.xpath("//a[contains(text(),'Mac (1)')]"));
	     Actions act = new Actions(driver);
	    
	    // act.moveToElement(desktop).click().perform();
	     Thread.sleep(1000);

	    act.moveToElement(desktop).moveToElement(mac).click().perform();
	   // driver.close();
	     
	}  
}
