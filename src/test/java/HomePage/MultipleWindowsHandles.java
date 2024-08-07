package HomePage;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MultipleWindowsHandles {
	
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
	    Thread.sleep(20000);
	    driver.findElement(By.id("form:viewTable:2:vne")).click();
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
	    
	   //function to handle multiple windows and operate the function required .//
	    //String firstWindow = driver.getWindowHandle();
	    driver.findElement(By.xpath("/html/body/form/table[3]/tbody/tr/td/table/tbody/tr[3]/td/div/div/table/tbody/tr[2]/td[5]/label[1]")).click();
	    Set<String> Windows = driver.getWindowHandles();
	    Thread.sleep(3000);
	    Iterator<String> itr = Windows.iterator();
	    while(itr.hasNext()) {
	    	String window = itr.next();
	    	driver.switchTo().window(window);
	    	if(driver.getTitle().equals("RO : LOS-5")) {
	    		driver.manage().window().maximize();
	    		Thread.sleep(10000);
	    		//driver.close();
	    		//form fields section here//
	    		driver.switchTo().frame("ngformIframe");
	    	driver.findElement(By.name("CustomerName")).sendKeys("ShivaRaj Mahato");
	    	driver.findElement(By.name("AccountNo")).sendKeys("01213141516171");
	    	driver.findElement(By.name("Groups")).sendKeys("SRM123");
	    	driver.findElement(By.name("GroupName")).sendKeys("ShivarajTestGroup");
	    	//for select from dropdown
//	    	 WebElement dropdown = driver.findElement(By.name("Entity"));
//	        Select select = new Select( (WebElement) dropdown);
//	        select.selectByVisibleText("For Profit Institution");
	    	driver.findElement(By.name("Entity")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div[3]/div/div[1]/div/select/option[3]")).click();
	    	driver.findElement(By.name("BusinessNature2")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[2]/div[4]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("BusinessNatureRemarks2")).sendKeys("Software Solution and testing Automation Software Product");
	    	driver.findElement(By.name("Relationship")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[3]/div/div[2]/div/div/div[1]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("DateAccountOpened")).sendKeys("01/11/2023");
	    	
	    	driver.findElement(By.name("q_SMELongRemarks_RemarksOfCompany")).sendKeys("Building the path to become the great leading Company Among the Software Solution..");
	    	driver.findElement(By.name("q_SMELongRemarks_RemarksOfOwner")).sendKeys("Guarantor is the CEO of SoftwareSolution ");
	    	driver.findElement(By.name("SectorGC")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[5]/div/div[2]/div/div[1]/div[1]/div/div[1]/div/select/option[11]")).click();
	    	driver.findElement(By.name("SubsectorGC")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[5]/div/div[2]/div/div[1]/div[2]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("SubSubSector")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[5]/div/div[2]/div/div[1]/div[3]/div/div[1]/div/select/option[7]")).click();
	    	driver.findElement(By.name("IncorporationProfitInst")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[13]/div/div[2]/div/div[1]/div[1]/div/div[1]/div/select/option[4]")).click();
	    	driver.findElement(By.id("add_tblShareholdingSME")).click();
	    	
	    	driver.findElement(By.name("table47_Name")).sendKeys("Shiva Raj Mahato");
	    	driver.findElement(By.name("table47_Holding")).sendKeys("50");
	    	driver.findElement(By.name("table47_IsGuarantor")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[2]/div/div[3]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("table47_CIC_required")).sendKeys("No");
	    	
	    	driver.findElement(By.name("table47_DOB")).sendKeys("01/11/1997");
	    	driver.findElement(By.name("table47_Gender")).sendKeys("Male");
	    	
	    	driver.findElement(By.name("table47_DateOfExecution")).sendKeys("01/01/2023");
	    	driver.findElement(By.name("table47_Amount")).sendKeys("200000");
	    	driver.findElement(By.id("addrow_tblShareholdingSME")).click();
	    	
	    	driver.findElement(By.id("add_tblKeyPersonSME")).click();
	    	driver.findElement(By.name("table48_Name")).sendKeys("Shiva raj mahato");
	    	driver.findElement(By.name("table48_StatusForProfitInst")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/select/option[4]")).click();
	    	driver.findElement(By.name("table48_IsGurantor")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[2]/div/div[3]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("table48_CitizenshipNo")).sendKeys("123456789");
	    	driver.findElement(By.name("table48_IssuedDate")).sendKeys("01/11/2023");
	    	driver.findElement(By.id("addrow_tblKeyPersonSME")).click();
	    	driver.findElement(By.name("CompanyRegNo")).sendKeys("1122334455");
	    	driver.findElement(By.name("DateRegisteredInst")).sendKeys("01/02/2023");
	    	driver.findElement(By.name("RegisteredWithInst")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[13]/div/div[2]/div/div[5]/div[4]/div/div[1]/div/select/option[6]")).click();
	    	driver.findElement(By.name("IssuedDistrictPostApproval")).sendKeys("corporate");
	    	driver.findElement(By.name("RegistrationExpiryDatePstApp")).sendKeys("01/12/2024");
	    	driver.findElement(By.name("PanNoInst")).sendKeys("1234567");
	    	driver.findElement(By.name("PanIssuedByInst")).sendKeys("Corporate Building Newplaza");
	    	driver.findElement(By.name("ProvinceInstReg")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[13]/div/div[2]/div/div[10]/div[1]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("DistrictInstReg")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[13]/div/div[2]/div/div[10]/div[2]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("MunicipalityVDCInstReg")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[13]/div/div[2]/div/div[10]/div[3]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("Location1InstReg")).sendKeys("32");
	    	driver.findElement(By.name("Location2InstReg")).sendKeys("Ramshah path");
	    	driver.findElement(By.name("HouseNoInstReg")).sendKeys("123");
	    	Thread.sleep(3000);
	    	//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[13]/div/div[2]/div/div[13]/div/div[1]"));
	    	//driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[13]/div/div[2]/div/div[13]/div/div[1]/input")).click();
//	    	driver.findElement(By.name("Relationship")).click();
//	    	driver.findElement(By.name("Relationship")).click();
//	    	WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("Flag3")));
//	    	Actions actions= new Actions(driver);
//	    	actions.moveToElement(element).click();
	    	//checkbox for first tab//
	    	driver.findElement(By.name("Flag3"));
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[13]/div/div[2]/div/div[13]/div/div[1]/label")).click();
	    	
	    	driver.findElement(By.name("FactorySameAsReg"));
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[13]/div/div[2]/div/div[17]/div/div[1]/label")).click();
	    	
	    	driver.findElement(By.name("MobileNo1Inst")).sendKeys("9876543212");
	    	driver.findElement(By.name("Email1Inst")).sendKeys("shivaraj.mahato@cas.com.np");
	    	driver.findElement(By.name("ApplicationDate")).sendKeys("01/11/2023");
	    	driver.findElement(By.name("Flag100")).click();
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[1]/div[17]/div/div[2]/div/div/div[1]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("flag101")).sendKeys("123456789");
	    	
	    	
	    	// For Facilities Section (Tab) Codes To fill The Facilities tab //
	    	Thread.sleep(3000);
	    	driver.findElement(By.id("sheet11_link")).click();
	    	driver.findElement(By.name("SubSegment")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/div/div[2]/div/div[1]/div[1]/div/div[1]/div/select/option[3]")).click();
	    	driver.findElement(By.name("Rorc")).sendKeys("20000");
	    	driver.findElement(By.name("CFRExpDate")).sendKeys("01/12/2024");
	    	driver.findElement(By.name("NextReviewDate")).sendKeys("01/02/2024");
	    	Thread.sleep(2000);
	    	driver.findElement(By.id("add_tblFacilitiesSME")).click();
	    	Thread.sleep(3000);
	    	driver.findElement(By.name("table51_ExistingOrNewFac")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[2]/div/div[2]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("table51_TypeOfFacility")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[2]/div/div[3]/div/div[1]/div/select/option[2]")).click();
	    	Thread.sleep(1000);
	    	driver.findElement(By.name("table51_Exposure")).click();
	    	
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[2]/div/div[4]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("table51_CreditFacility")).click();
	    	//////////////////////////////////////////////////////////////////////////////////////////////////////
	    	
	    	driver.findElement(By.name("table51_RefDesc")).click();
	    	///////////////////////////////////////////////////////////////////
	    	
	    	driver.findElement(By.name("table51_PurposeforCreditFac")).click();
	    	////////////////////////////////////////////////////////////////////
	    	
	    	driver.findElement(By.name("table51_Class")).sendKeys("ABCDEFGH");
	    	driver.findElement(By.name("table51_NatureOfFacility")).click();
	    	driver.findElement(By.xpath("/html/body/div[5]/div/div/div[2]/div[2]/div/div[15]/div/div[1]/div/select/option[2]")).click();
	    	driver.findElement(By.name("table51_ProposedLimit")).sendKeys("2000000");
	    	driver.findElement(By.name("table51_JustificationFacilities")).sendKeys(" Facilities Justification for the Loan process goes on here");
	    	driver.findElement(By.name("table51_DPMargin")).sendKeys("20000");
	    	
	    	// this is SAVE AND CLOSE KEY FOR FACILITIES//
	    	driver.findElement(By.id("addrow_tblFacilitiesSME")).click();
	    	
	    	driver.findElement(By.name("TotalFundedExisting")).sendKeys("65657");
	    	driver.findElement(By.name("TotalFundedProposed")).sendKeys("4532");
	    	driver.findElement(By.name("TotalFundedOutstanding")).sendKeys("1234");
	    	driver.findElement(By.name("fundedloanadminfee")).sendKeys("234567");
	    	
	    	driver.findElement(By.name("TotalNonFundExisting")).sendKeys("65432");
	    	driver.findElement(By.name("TotalNonFundProposed")).sendKeys("4532");
	    	driver.findElement(By.name("TotalNonFundOutstanding")).sendKeys("1234");
	    	driver.findElement(By.name("nonfundedloanadminfee")).sendKeys("234567");
	    	
	    	Thread.sleep(3000);
	    	driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[2]/div[1]/div/div[2]/div/div[11]/div/button")).click();
    	    driver.findElement(By.name("q_SMELongRemarks_modeOfDisbursement")).sendKeys("Mode of Disbursement for the Loan Process is here on ");
    	    driver.findElement(By.name("q_SMELongRemarks_repaymentField")).sendKeys("Repayment field for Loan process is here on");
    	    driver.findElement(By.name("OtherChargersWavers")).sendKeys("OtherChargerswavers if any for Loan Process is here on");
    	    
    	    // net Tab swithches here on(Security Details And Documents)//
    	    driver.findElement(By.id("sheet13_link")).click();
    	    
    	    driver.findElement(By.name("RealEstate")).click();
    	    driver.findElement(By.xpath("/html/body/div[2]/div/div/div[6]/div/div/div[2]/div/div/div/div/div/div/div[3]/div[1]/div/div[2]/div/div[2]/div[1]/div/div[1]/label")).click();
	    	
	    	
	    	}
	    }
	    
	    
	    
}

}
