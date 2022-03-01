package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestng {
	
@Test(dataProvider="create")
 public void test(String username,String password) throws InterruptedException {
	

	 System.setProperty("webdriver.chrome.driver","D://chromedriver_win32//chromedriver.exe");
	 WebDriver driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.saucedemo.com/");
	 driver.findElement(By.id("user-name")).sendKeys(username);
	 Thread.sleep(1000);
	 driver.findElement(By.id("password")).sendKeys(password);
	 Thread.sleep(1000);
     driver.findElement(By.id("login-button")).click();
	 Thread.sleep(3000);

     driver.close();
}
 @DataProvider(name= "create")
 
 public Object[][] dataset()
 {
	 return new Object[][]
			 {
		 {"standard_user"," secret_sauce"},
		 { "locked_out_user", "secret_sauce" },
		 {"problem_user", "secret_sauce"  },
		 {"performance_glitch_user", "secret_sauce"}
			 };
			 
		 
			 }
 
 
 }
 