package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;
import org.testng.annotations.Test;

public class FirstTestNg {
@Test(priority=1)
public void launchcrome() {
 System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
 WebDriver driver= new ChromeDriver();
 driver.navigate().to("https://github.com/");
 driver.manage().window().maximize();
 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
 driver.close();
}
	
@Test(priority=2)
public void launchGecko() {
	System.setProperty("webdriver.gecko.driver","D://geckodriver//geckodriver.exe");
	 WebDriver driver= new FirefoxDriver();
	 driver.navigate().to("https://www.google.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.close();
	}
}



