package test.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Indeed {
	 public static void main( String[] args ) throws Exception
	    {
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://www.indeed.com");
	        
	       Thread.sleep(3000);
	     
	       
	        
	       
	       String title =driver.getTitle();
	       System.out.println("title of page is:" +title);
	     int l = title.length();
	     System.out.println("length of title is:" +l);
	    
	        driver.close();

}
}
