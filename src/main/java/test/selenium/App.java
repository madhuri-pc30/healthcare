package test.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\madhuprash\\Downloads\\chromedriver_win32\\chromedriver.exe\"");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.amazon.com");
        driver.navigate().to("https://www.amazon.com/your-account");
        driver.getCurrentUrl(); 
        Thread.sleep(3000);
        driver.navigate().forward(); 
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().refresh(); 
        System.out.println(driver.getTitle());
        
        Thread.sleep(2000);
        driver.close();


        
        
    }
}
