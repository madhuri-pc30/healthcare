package test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragDrop {
	public static void main(String[]args) throws Exception{

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
	     
	   WebElement rome = driver.findElement(By.id("box6"));
	   
	   WebElement italy = driver.findElement(By.id("box106"));
	    Actions act = new Actions(driver);
	    act.dragAndDrop(rome, italy).perform();
	    
	    WebElement washington = driver.findElement(By.id("box3"));
	    WebElement united = driver.findElement(By.id("box103"));
	    
	    act.dragAndDrop(washington, united).perform();
	    
	}
}
