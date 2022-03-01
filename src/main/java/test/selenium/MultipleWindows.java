package test.selenium;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize(); 
	    driver.get("https://www.amazon.com/");
	     Thread.sleep(2000);
	    driver.switchTo().newWindow(WindowType.TAB);
	    driver.get("https://github.com/");
	     Thread.sleep(2000);
	     driver.switchTo().newWindow(WindowType.TAB);
         driver.get("https://www.google.com/");
         Thread.sleep(2000);
      ArrayList<String> windowHandles = new  ArrayList<String>(driver.getWindowHandles());
         String amazon  = windowHandles.get(0);
         String github = windowHandles.get(1);
         String google  = windowHandles.get(2);
         driver.switchTo().window(amazon);
         Thread.sleep(2000);
         driver.switchTo().window(github);
         Thread.sleep(2000);
         driver.switchTo().window(google);
         Thread.sleep(2000);
         driver.quit();
      
      
         
         
}
}