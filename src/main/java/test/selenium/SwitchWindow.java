package test.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {
public static void main(String[] args)  throws Exception{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     WebDriver driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://www.amazon.com/");
	     Thread.sleep(2000);
	    String amazon= driver.getWindowHandle();
	    driver.switchTo().newWindow(WindowType.WINDOW);
	    driver.get("https://github.com/");
	     Thread.sleep(2000);
	     driver.switchTo().window(amazon);
	     Thread.sleep(2000);
	     driver.quit();

}
}