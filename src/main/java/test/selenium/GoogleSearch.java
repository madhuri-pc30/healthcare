package test.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static void main(String[]args) throws Exception{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("https://www.google.com/");
	     driver.manage().window().maximize();
	     driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("java");
	     Thread.sleep(2000);
	     List <WebElement> list = driver.findElements(By.xpath("//ul[@role='listbox']/li/descendant :: div[@class='eIPGRd']"));
	     System.out.println(list.size());
	     for(int i=0;i<list.size();i++) {
	    	 
	    String listitem	= list.get(i).getText();
	    System.out.println(listitem);
	    if(listitem.contains("java download")) {
	    	list.get(i).click();
	    	break;
	    }
	    	 
	     }
	     
	     
	     
	     
	}

}
