package test.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {
	public static void main(String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://www.amazon.in/");
	     WebElement s  = driver.findElement(By.linkText("Mobiles"));
	       s.click();
	       JavascriptExecutor scrolling =(JavascriptExecutor) driver;
	       scrolling.executeScript("window.scrollBy(0,1000)");
	       Thread.sleep(3000);
	        scrolling.executeScript("window.scrollBy(0,-500)");
	        Thread.sleep(3000);
	        scrolling.executeScript("window.scrollBy(0,document.body.scrollheight)");
	        driver.close();
	        
		
	}

}
