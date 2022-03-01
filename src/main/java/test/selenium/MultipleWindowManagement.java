package test.selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowManagement {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demoqa.com/browser-windows");
       WebElement windowbutton  =driver.findElement(By.id("windowButton"));
       	WebElement windowmessage= driver.findElement(By.id("messageWindowButton"));
       	windowbutton.click();
       	windowmessage.click();
       	ArrayList<String> windowHandles  =new ArrayList<String>(driver.getWindowHandles());
       	for(String windowHandle : windowHandles) {
       		driver.switchTo().window(windowHandle);
       		
       	}
	}

}
