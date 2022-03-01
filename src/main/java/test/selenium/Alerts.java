package test.selenium;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
	public static void main(String[]args) throws Exception{
	 
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	      driver.get("https://demoqa.com/alerts");
	        driver.manage().window().maximize();
	        Thread.sleep(3000);
	        WebElement element = driver.findElement(By.xpath("//button[@id='alertButton']"));
	        element.click();
	        Thread.sleep(2000);
	        Alert  alertmsg  =driver.switchTo().alert();
	        alertmsg.accept();
	        WebElement element2 = driver.findElement(By.xpath("//button[@id='confirmButton']"));
	        element2.click();
	        Thread.sleep(2000);
	        alertmsg.dismiss();
	        // WebElement element3 = driver.findElement(By.xpath("//button[@id='promtButton']"));
	        // element3.click();
	         //Thread.sleep(2000);
	         //alertmsg.sendKeys("selenium");
	         TakesScreenshot screenshot =(TakesScreenshot)driver;
	         File file = screenshot.getScreenshotAs(OutputType.FILE);
	         FileUtils.copyFile(file, new File("D://madhuri//image1.jpg"));
	        
	        driver.close();
	        
	 }
}
