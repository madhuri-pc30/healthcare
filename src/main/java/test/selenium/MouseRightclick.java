package test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightclick {

	public static void main(String[]args) throws Exception{

	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver = new ChromeDriver();
     driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
     driver.manage().window().maximize();
   WebElement button =driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
     Actions act= new Actions(driver);
     act.contextClick(button).perform();
     
}
}
