package test.selenium;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {


	

	public static void main(String[]args) throws Exception{

	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("https://accounts.google.com/signup");
     driver.manage().window().maximize();
    WebElement element1 =driver.findElement(By.xpath("//input[@id='firstName']"));
    element1.sendKeys("john");
    WebElement element2 =driver.findElement(By.xpath("//input[@id='lastName']"));
    element2.sendKeys("peter");
    WebElement element3 =driver.findElement(By.xpath("//input[@id='username']"));
    element3.sendKeys("pqvfhfw124");
    
   Actions action = new Actions(driver);
   
    action.keyDown(Keys.CONTROL);
    action.sendKeys("a");
    action.keyUp(Keys.CONTROL);
    action.perform();
    
    action.keyDown(Keys.CONTROL);
    action.sendKeys("c");
    action.keyUp(Keys.CONTROL);
    action.perform();
    
    action.sendKeys(Keys.TAB);
    action.perform();
    
    action.sendKeys(Keys.TAB);
    action.perform();
    
    action.keyDown(Keys.CONTROL);
    action.sendKeys("V");
    action.keyUp(Keys.CONTROL);
    action.perform();
    
   WebElement element4 =driver.findElement(By.xpath("//input[@name='Passwd']"));
    
    action.sendKeys(Keys.TAB);
    action.perform();
   WebElement element5 =driver.findElement(By.xpath("//input[@name='ConfirmPasswd']"));
    action.keyDown(Keys.CONTROL);
    action.sendKeys("V");
    action.keyUp(Keys.CONTROL);
    action.perform();
    WebElement element6 = driver.findElement(By.xpath("//input[@id='i3']"));
     element6.click();

     assertEquals("pqvfhfw124", element4.getAttribute("value"));
//https://www.softwaretestinghelp.com/assertion-examples-practical-applications/
     
     driver.close();
}

}