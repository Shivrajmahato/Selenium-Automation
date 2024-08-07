//package HomePage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageAccess {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "F:\\Project-Workspace-For-Java\\webDrivers\\geckodriver.exe");
            //WebDriverManager.chromedriver().setup();
//		//ChromeDriver driver = new ChromeDriver();
//		//FirefoxDriver driver = new FirefoxDriver();
//		  ChromeDriver driver = new ChromeDriver();
//		
//		driver.get("http://192.168.10.10:8080/omniapp/pages/login/loginapp.app");
//		driver.manage().window().maximize();
//		driver.findElements(By.xpath(xpathExpression))
		// function to read properties from the file 
//		String propString = System.getProperty("user.dir");
//		System.out.println(propString);
//		System.setProperty("webdriver.chrome.driver",propString+"/drivers/chromeDriver/chromedriver.exe");
//        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("http://192.168.10.10:8080/omniapp/pages/login/loginapp.app");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement textElement = driver.findElement(By.id("oaloginform:userid"));
        textElement.sendKeys("krishna");
        WebElement textElementA = driver.findElement(By.id("oaloginform:password"));
        textElementA.sendKeys("system123#");
        driver.findElement(By.id("oaloginform:loginbtn")).click();
        //Thread.sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div/div/div[2]/div/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td/input"))).click();
        
        
        Thread.sleep(10000);
        Set<String> setHandler = driver.getWindowHandles();
        Iterator<String> iterable = setHandler.iterator();
        String parIdStr = iterable.next();
        driver.switchTo().window(parIdStr);
        //chromeDriver.findElement(By.id("form:viewTable:2:vne")).click();
        driver.findElement(By.xpath("/html/body/table[4]/tbody/tr[4]/td/form/table[1]/tbody/tr/td[2]/table/tbody/tr/td[6]/div/div/table/tbody/tr/td[3]/div")).click();
        
        driver.findElement(By.id("form:logoutLink2")).click();
        driver.close();
        driver.quit();
      
        

	}

}
