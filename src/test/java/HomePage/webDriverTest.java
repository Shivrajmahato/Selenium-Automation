package HomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webDriverTest {
	public static String browser = "chrome";//external configuration xsl,csv
	public static WebDriver driver;
	public static void main(String[] args) { 
//	WebDriverManager.chromedriver().setup();
//	ChromeDriver driver = new ChromeDriver();
//	driver.get("http://www.ebay.com");
//	driver.manage().window().maximize();
		if (browser.equals("Firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			}
		else if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			}
		else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			}
		driver.get("http://192.168.10.10:8080/omniapp/pages/login/loginapp.app");
		driver.findElement(By.id("oaloginform:userid")).sendKeys("padmin");
		driver.findElement(By.id("oaloginform:password")).sendKeys("system123#");
		driver.findElement(By.id("oaloginform:loginbtn")).sendKeys(Keys.RETURN);
	}	
	
	
	

}
