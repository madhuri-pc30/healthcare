package test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Display {

	
		public static void main(String[]args) throws Exception{
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 WebDriver driver = new ChromeDriver();
		        driver.manage().window().maximize();
		        driver.get("http://www.amazon.in/");
		        WebElement m = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		        //m.click();
		        boolean disp = (boolean)m.isDisplayed();
		        System.out.println(disp);
		        
	}

}
