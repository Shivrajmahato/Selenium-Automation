package HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
//by this method we make global variable for driver which further neglates the depencency to make use of certain browser only
public class LoginTest {
public static String browser = "chrome";//external configuration xsl,csv
public static WebDriver driver;
//@SuppressWarnings("deprecation")
public static void main(String[] args) throws InterruptedException{
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
	driver.get("http://202.51.1.27:8080/omniapp/pages/login/loginapp.app");
    driver.manage().window().maximize();
   // driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    WebElement textElement = driver.findElement(By.id("oaloginform:userid"));
    textElement.sendKeys("padmin2");
    WebElement textElementA = driver.findElement(By.id("oaloginform:password"));
    textElementA.sendKeys("system123#");
    driver.findElement(By.id("oaloginform:loginbtn")).click();
    //Thread.sleep(1000);
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div/div/div[2]/div/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td/input"))).click();
    
    
   // Thread.sleep(10000);
//    Wait<WebDriver> wait1 = new FluentWait<WebDriver>(driver)
// 	       .withTimeout(Duration.ofSeconds(30L))
// 	       .pollingEvery(Duration.ofSeconds(5L))
// 	       .ignoring(NoSuchElementException.class);
//    Set<String> setHandler = driver.getWindowHandles();
//    Iterator<String> iterable = setHandler.iterator();
//    String parIdStr = iterable.next();
//    driver.switchTo().window(parIdStr);
   //driver.findElement(By.xpath("/html/body/table[4]/tbody/tr[4]/td/form/table[1]/tbody/tr/td[2]/table/tbody/tr/td[4]/div/label[4]")).click();
 

    //driver.wait(10);
    //Thread.sleep(10000);
//    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
     //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.id("form:viewTable:2:vne"))).click();
    
    //element to click User Desktop tab in OmniApp
      //driver.findElement(By.id("form:viewTable:2:vne")).click();
      
      //driver.wait(05);
    
      //driver.findElement(By.id("//select[@id=\"wlf:processlist\"]")).click();
      //driver.findElement(By.xpath("//*[@id=\"wlf:processlist\"]/option[19]"))
      
    //driver.findElement(By.xpath("/html/body/table[4]/tbody/tr[4]/td/form/table[1]/tbody/tr/td[2]/table/tbody/tr/td[6]/div/div/table/tbody/tr/td[3]/div"));
   //driver.
   // driver.findElement(By.id("form:logoutLink2")).click();
    //System.out.println("All Ok");
    //driver.close();
    //driver.quit();
      Thread.sleep(20000);
    //((WebElement) driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/div/select[2]"))).click();
      
//    WebElement dropdown = driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/div/select[2]"));
//    Select select = new Select( (WebElement) dropdown);
//    select.selectByValue("39");
//      WebElement dropdownElement = driver.findElement(By.xpath("//select[@id=\'wlf:processlist\']"));
//      Select select = new Select(dropdownElement);
//      select.selectByValue("39");
//    Set<String> setHandler = driver.getWindowHandles();
// Iterator<String> iterable = setHandler.iterator();
//String parIdStr = iterable.next();
// driver.switchTo().window(parIdStr);
// WebElement dropdown1 = driver.findElement(By.id("wlf:scrollSrchOpt"));
// Select select1 = new Select( (WebElement) dropdown1 );
// select1.selectByValue("1");

 
    
    
}
}
