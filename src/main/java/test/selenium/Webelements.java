package test.selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Webelements {
	 public static void main( String[] args ) throws Exception
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://www.amazon.in/");
	        driver.findElement(By.linkText("Mobiles")).click();
	        WebElement searchbar = driver.findElement(By.id("twotabsearchtextbox"));
	        searchbar.sendKeys("Iphone");
	        driver.findElement(By.id("nav-search-submit-button")).click();
	       
	        Thread.sleep(3000);
	        driver.close();
	        
	        
	 }

}
