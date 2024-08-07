package HomePage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.10.10:8080/omniapp/pages/login/loginapp.app");
		driver.manage().window().maximize();
		 WebElement textElement = driver.findElement(By.id("oaloginform:userid"));
		    textElement.sendKeys("padmin2");
		    WebElement textElementA = driver.findElement(By.id("oaloginform:password"));
		    textElementA.sendKeys("system123#");
		    driver.findElement(By.id("oaloginform:loginbtn")).click();
		    //Thread.sleep(1000);
		    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/form/div/div/div[2]/div/div/table[1]/tbody/tr/td/table/tbody/tr[4]/td/table/tbody/tr[1]/td/table/tbody/tr[1]/td/input"))).click();
		    //Thread.sleep(10000);
//		    Set<String> setHandler = driver.getWindowHandles();
//		    Iterator<String> iterable = setHandler.iterator();
//		    String parIdStr = iterable.next();
//		    driver.switchTo().window(parIdStr);
		    Thread.sleep(10000);
		    driver.findElement(By.id("form:viewTable:2:vne")).click();
//		    Set<String> setHandler = driver.getWindowHandles();
//		    Iterator<String> iterable = setHandler.iterator();
//		    String parIdStr = iterable.next();
//		    driver.switchTo().window(parIdStr);
		   // driver.findElement(By.id("iframe_Int3002")).click();
		    //Thread.sleep(10000);
//		    WebElement parentElement = driver.findElement(By.id("wlf:sbcont"));
//		    List<WebElement> allChildElements = parentElement.findElements(By.xpath("/html/body/form/table/tbody/tr/td[1]/div/select[2]"));
//		    allChildElements.size();
//		    WebElement element = driver.findElement(By.tagName("div"));
//		    System.out.println("elements are:" +element );
//
//            // Get all the elements available with tag name 'p'
//            List<WebElement> elements = element.findElements(By.xpath("/html/body/form/table/tbody/tr/td[1]/div/select[2]/option[19]"));
//            for (WebElement e : elements) {
//                System.out.println(e.getText());
//		    
//		WebElement droptestElement = driver.findElement(By.xpath("//select[@class=\"oa-cmenu oa-group\" and @name=\"wlf:processlist\"]"));
//		Select drop = new Select(droptestElement);
//		drop.selectByVisibleText("LOSNew");
//		
//		
//            }
//            String attr = driver.switchTo().activeElement().getAttribute("title");
//            System.out.println(attr);
		    Thread.sleep(10000);
		    driver.switchTo().frame("iframe_Int3002");
		    driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/div/select[2]/option[19]")).click();
		    driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/div/div/input[1]")).click();
		    driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/div/div/input[1]")).clear();
		    driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/div/div/input[1]")).sendKeys("5");
		    driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/div/div/input[3]")).click();
		    Thread.sleep(10000);
		    driver.switchTo().parentFrame();
		    driver.switchTo().frame("iframe_Int38");
		    //driver.switchTo().frame("iframe_Int39");
		    //driver.findElement(By.className("scrollTableContainerDataViewTable"));
		    driver.findElement(By.xpath("/html/body/form/table[3]/tbody/tr/td/table/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td[5]/label[1]")).click();
		    
		    //WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(30)); 
		    //wait1.until(ExpectedConditions.visibilityOfElementLocated(By.className("wrtb"))).click();
		    
	}

}
