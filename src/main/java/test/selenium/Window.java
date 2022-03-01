package test.selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {
	public static void main(String[]args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://www.amazon.in/");
	       // driver.switchTo().newWindow(WindowType.TAB);
	       // driver.get("http://www.amazon.in/");
	       // driver.switchTo().newWindow(WindowType.WINDOW);
	        //driver.get("http://www.amazon.in/");
	       // int width =driver.manage().window().getSize().getWidth();
	      //  System.out.println("width of window is " +width);
	       // int height =driver.manage().window().getSize().getHeight();
	      //  System.out.println("height of window is " +height);
	     //   Dimension size =driver.manage().window().getSize();
	       // System.out.println("size of window is " +size);
	        driver.manage().window().setSize(new Dimension(1024,728));
	        Dimension size =driver.manage().window().getSize();
	        System.out.println("size of window is " +size);
	        
}
}
