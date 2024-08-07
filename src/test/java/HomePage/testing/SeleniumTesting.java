package testing;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumTesting {

    public static void main(String[] args) throws IOException, InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shiva Raj\\Downloads\\chromedriver-win64");

        ChromeOptions option = new ChromeOptions();
        option.setBinary("C:\\Users\\Shiva Raj\\Downloads\\chromedriver-win64");
        WebDriver driver = new ChromeDriver(option);
        driver.get("http://202.51.1.27:8080/omniapp/pages/login/loginapp.app");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Properties p = new Properties();
        try {
            FileInputStream fis = new FileInputStream("C:\\\\Users\\\\Dell\\\\eclipse-workspace\\\\SeleniumAutomation\\\\src\\\\main\\\\resources\\\\Data\\\\user.properties");
            p.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            return;
        }

        driver.findElement(By.id("oaloginform:userid")).sendKeys(p.getProperty("username"));
        driver.findElement(By.id("oaloginform:password")).sendKeys(p.getProperty("password"));
        driver.findElement(By.id("oaloginform:loginbtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html[1]/body[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]"))).click();
        Thread.sleep(5000);

        driver.findElement(By.id("form:viewTable:2:vne")).click();
        Thread.sleep(5000);

        driver.findElement(By.id("form:viewTable:2:svn")).click();
        Thread.sleep(5000);
        driver.switchTo().frame("iframe_Int3002");
        Thread.sleep(1000);

        driver.findElement(By.xpath("//*[@id=\"wlf:processlist\"]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td[1]/div/select[2]/option[5]")).click();
        driver.findElement(By.xpath("//*[@id=\"wlf:processlist\"]")).click();
        driver.findElement(By.xpath("//input[@id='wlf:Prefix']")).click();

        driver.findElement(By.id("wlf:Prefix")).sendKeys("10");
        driver.findElement(By.id("wlf:cmdBtnRS")).click();

        Thread.sleep(5000);

        driver.switchTo().parentFrame();
        driver.switchTo().frame("iframe_Int42");

        driver.findElement(By.xpath("/html/body/form/table[3]/tbody/tr/td/table/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td[5]/label[1]")).click();
        Set<String> Windows = driver.getWindowHandles();
        Thread.sleep(5000);
      Iterator<String> itr = Windows.iterator();
        while (itr.hasNext()) {
            String window = itr.next();
           driver.switchTo().window(window);
            if (driver.getTitle().equals("Help Desk : Employee_Assesment_R-10")) {
                driver.manage().window().maximize();
                Thread.sleep(5000);
                driver.switchTo().frame("ngformIframe");
                driver.findElement(By.name("FirstName")).sendKeys("Manish");
                driver.findElement(By.name("LastName")).sendKeys("Shrestha");
                driver.findElement(By.name("Your_Position")).sendKeys("Developer");
                driver.findElement(By.name("Phone_Number")).sendKeys("1234567891");
                driver.findElement(By.name("intern_decision")).click();
                driver.findElement(By.xpath("//*[@id=\"intern_decision\"]/option[2]")).click();
                driver.findElement(By.name("intern_decision")).click();

                driver.findElement(By.id("add_q_addresss")).click();
                driver.findElement(By.name("table7_state")).sendKeys("Bagmati");
                driver.findElement(By.name("table7_city")).sendKeys("Kathmandu");
                driver.findElement(By.name("table7_zipcode")).sendKeys("44600");
                driver.findElement(By.name("table7_address")).sendKeys("Taukhel");
                driver.findElement(By.id("addrow_q_addresss")).click();
                driver.switchTo().parentFrame();
                driver.findElement(By.id("Save")).click();
                Thread.sleep(5000);

                driver.findElement(By.id("Introduce")).click();
                driver.switchTo().frame("popupIFrame_confirmdone");
                driver.findElement(By.name("BtnOk")).click();
                ///////////////////////////////////
                Thread.sleep(5000);
                


                //driver.findElement(By.id("wlf:Prefix")).sendKeys("7");
                //driver.findElement(By.id("wlf:cmdBtnRS")).click();
              //  driver.switchTo().frame("div_Int42");
            //    driver.findElement(By.id("wlf:refreshLink")).click();

//            driver.switchTo().parentFrame();
//	    	driver.switchTo().frame("iframe_Int42");
//	    	driver.findElement(By.id("wlf:refreshLink")).click();
                
                driver.findElement(By.xpath("//input[@id='wlf:Prefix']")).click();

                driver.findElement(By.id("wlf:Prefix")).sendKeys("10");
                driver.findElement(By.id("wlf:cmdBtnRS")).click();

                Thread.sleep(5000);

                driver.switchTo().parentFrame();
                driver.switchTo().frame("iframe_Int42");
                driver.findElement(By.xpath("/html/body/form/table[3]/tbody/tr/td/table/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td[5]/label[1]")).click();

        driver.switchTo().frame("iframe_Int3002");
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//input[@id='wlf:Prefix']")).click();

        driver.findElement(By.id("wlf:Prefix")).sendKeys("10");
        driver.findElement(By.id("wlf:cmdBtnRS")).click();

        Thread.sleep(5000);

        driver.switchTo().parentFrame();
        driver.switchTo().frame("iframe_Int42");
        
            Iterator<String> itr0 = Windows.iterator();
            while (itr0.hasNext()) {
                String window0 = itr0.next();
            driver.switchTo().window(window0);
                if (driver.getTitle().equals("form Verifier : Employee_Assesment_R-10")) {
                    driver.manage().window().maximize();
                    Thread.sleep(5000);
                    driver.switchTo().parentFrame();
                    driver.findElement(By.id("Done")).click();
                    driver.switchTo().frame("popupIFrame_confirmdone");
                    driver.findElement(By.name("BtnOk")).click();
                    Thread.sleep(5000);
                    
                }
                driver.switchTo().frame("iframe_Int3002");
                Thread.sleep(1000);
                
                driver.findElement(By.xpath("//input[@id='wlf:Prefix']")).click();

                driver.findElement(By.id("wlf:Prefix")).sendKeys("10");
                driver.findElement(By.id("wlf:cmdBtnRS")).click();

                Thread.sleep(5000);

                driver.switchTo().parentFrame();
                driver.switchTo().frame("iframe_Int42");
                
                driver.findElement(By.xpath("/html/body/form/table[3]/tbody/tr/td/table/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td[5]/label[1]")).click();
               
                Iterator<String> itr1 = Windows.iterator();
                while (itr1.hasNext()) {
                    String window1 = itr1.next();
                driver.switchTo().window(window1);
                if (driver.getTitle().equals("form : Employee_Assesment_R-10")) {
                    driver.manage().window().maximize();
                    Thread.sleep(5000);
                    driver.switchTo().parentFrame();
                    driver.findElement(By.id("Done")).click();
                    driver.switchTo().frame("popupIFrame_confirmdone");
                    driver.findElement(By.name("BtnOk")).click();
                    Thread.sleep(5000);
                }
                driver.switchTo().frame("iframe_Int3002");
                Thread.sleep(1000);
                
                driver.findElement(By.xpath("//input[@id='wlf:Prefix']")).click();

                driver.findElement(By.id("wlf:Prefix")).sendKeys("10");
                driver.findElement(By.id("wlf:cmdBtnRS")).click();

                Thread.sleep(5000);

                driver.switchTo().parentFrame();
                driver.switchTo().frame("iframe_Int42");

                driver.findElement(By.xpath("/html/body/form/table[3]/tbody/tr/td/table/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td[5]/label[1]")).click();
               
                
                Iterator<String> itr2 = Windows.iterator();
                while (itr2.hasNext()) {
                    String window2 = itr2.next();
                driver.switchTo().window(window2);

                if (driver.getTitle().equals("Teamlead : Employee_Assesment_R-10")) {
                    driver.manage().window().maximize();
                    Thread.sleep(5000);
                    driver.switchTo().parentFrame();
                    driver.findElement(By.id("Done")).click();
                    driver.switchTo().frame("popupIFrame_confirmdone");
                    driver.findElement(By.name("BtnOk")).click();
                    Thread.sleep(5000);
                }
                driver.switchTo().frame("iframe_Int3002");
                Thread.sleep(1000);
                
                driver.findElement(By.xpath("//input[@id='wlf:Prefix']")).click();

                driver.findElement(By.id("wlf:Prefix")).sendKeys("10");
                driver.findElement(By.id("wlf:cmdBtnRS")).click();

                Thread.sleep(5000);

                driver.switchTo().parentFrame();
                driver.switchTo().frame("iframe_Int42");
               
              
                driver.findElement(By.xpath("/html/body/form/table[3]/tbody/tr/td/table/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td[5]/label[1]")).click();
                Iterator<String> itr3 = Windows.iterator();
                while (itr3.hasNext()) {
                    String window3 = itr3.next();
                driver.switchTo().window(window3);
                if (driver.getTitle().equals("project manager : Employee_Assesment_R-10")) {
                    driver.manage().window().maximize();
                    Thread.sleep(5000);
                    driver.switchTo().parentFrame();
                    driver.findElement(By.id("Done")).click();
                    driver.switchTo().frame("popupIFrame_confirmdone");
                    driver.findElement(By.name("BtnOk")).click();
                    Thread.sleep(5000);
                }
                driver.switchTo().frame("iframe_Int3002");
                Thread.sleep(1000);
                driver.findElement(By.xpath("//input[@id='wlf:Prefix']")).click();

                driver.findElement(By.id("wlf:Prefix")).sendKeys("10");
                driver.findElement(By.id("wlf:cmdBtnRS")).click();

                Thread.sleep(5000);

                driver.switchTo().parentFrame();
                driver.switchTo().frame("iframe_Int42");

                driver.findElement(By.xpath("/html/body/form/table[3]/tbody/tr/td/table/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td[5]/label[1]")).click();
                Iterator<String> itr4 = Windows.iterator();
                while (itr4.hasNext()) {
                    String window4 = itr4.next();
                driver.switchTo().window(window4);
                if (driver.getTitle().equals("HR department : Employee_Assesment_R-10")) {
                    driver.manage().window().maximize();
                    Thread.sleep(5000);
                    driver.switchTo().parentFrame();
                    driver.findElement(By.id("Done")).click();
                    driver.switchTo().frame("popupIFrame_confirmdone");
                    driver.findElement(By.name("BtnOk")).click();
                    Thread.sleep(5000);
                }

                driver.switchTo().frame("iframe_Int3002");
                Thread.sleep(1000);
               
                driver.findElement(By.xpath("//input[@id='wlf:Prefix']")).click();

                driver.findElement(By.id("wlf:Prefix")).sendKeys("10");
                driver.findElement(By.id("wlf:cmdBtnRS")).click();

                Thread.sleep(5000);

                driver.switchTo().parentFrame();
                driver.switchTo().frame("iframe_Int42");
                driver.findElement(By.xpath("/html/body/form/table[3]/tbody/tr/td/table/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td[5]/label[1]")).click();
                Iterator<String> itr5 = Windows.iterator();
                while (itr5.hasNext()) {
                    String window5 = itr5.next();
                driver.switchTo().window(window5);
                if (driver.getTitle().equals("store : Employee_Assesment_R-10")) {
                    driver.manage().window().maximize();
                    Thread.sleep(5000);
                    driver.switchTo().parentFrame();
                    driver.findElement(By.id("Done")).click();
                    driver.switchTo().frame("popupIFrame_confirmdone");
                    driver.findElement(By.name("BtnOk")).click();
                    Thread.sleep(5000);

                    driver.close();
                    driver.quit();
                }
            }
        }
    }
}
}
}
}
}
}

}
