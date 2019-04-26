package Test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RMS_Task_Module {

	
	WebDriver driver;
	String msg;
	WebDriverWait wait;
	JavascriptExecutor jse;
	
	@Test
	public void homePage() throws InterruptedException{
	System.setProperty("webdriver.gecko.driver", "F:\\E Drive\\Bibhuti\\Desktop\\Selenium\\geckodriver.exe");

	driver = new FirefoxDriver();
	// Maximize the browser
	Thread.sleep(2000);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("http://chn-imec07-ap/RMSProdPublishTest/");
	driver.manage().window().maximize();
//	Enter Employee ID
	Thread.sleep(5000);
	driver.findElement(By.name("txtUsername")).sendKeys("606555");
//	Click on login
	driver.findElement(By.name("ButtonLogOn")).click();
//	Click on task
	driver.findElement(By.xpath("//a[text()='Tasks']")).click();
//	Allocated Invoice Report
	driver.findElement(By.xpath("//ul[@class='dropdown-menu sub-menu']/li/a[text()='Allocated Invoices']")).click();
//	Choose file 
//	driver.findElement(By.id("Fupload")).sendKeys("D:\\WSR\\Feb\\Project Execution Details -FIN 02-02 to 09-02.xlsx");
//	Click on upload
//	driver.findElement(By.id("BtnUpload")).click();
//	Click on company code
	driver.findElement(By.id("TxtCompanyCode")).click();
//	Select company code 
	driver.findElement(By.id("ddlCompany_0")).click();
//	Click on sbu
	driver.findElement(By.id("TxtLob")).click();
//	Select SBU
	driver.findElement(By.id("ddlSBU_0")).click();
//	Click on Region
	driver.findElement(By.id("TxtRegion")).click();
//	Select Region
	driver.findElement(By.id("ddlRegion_0")).click();
//	Click on Practice
	driver.findElement(By.id("TxtDivision")).click();
//	Select Practice
	driver.findElement(By.id("ddlDivision_0")).click();
//	Click on currency
	driver.findElement(By.id("TxtCurrency")).click();
//	Select currency
	driver.findElement(By.id("ddlCurrency_0")).click();
	Thread.sleep(5000);
//	Click on CE Type
//	driver.findElement(By.id("TxtCEType")).click();
//	Select CE Type
//	driver.findElement(By.id("ddlCEType_0")).click();
//	Click on project type
	driver.findElement(By.id("TxtProjectType")).click();
//	Selct PROJECT TYP
	driver.findElement(By.id("ddlProjectType_0")).click();
//	Click on InvoiceStatus
	driver.findElement(By.id("TxtInvoiceStatus")).click();
//	Select InvoiceStatus
	driver.findElement(By.id("ddlInvoiceStatus_0")).click();
//	Clickm on PDD
	driver.findElement(By.id("txtPDD")).click();
//	Select PDD
	driver.findElement(By.id("ddlPDD_0")).click();
//	Click on Search By
	WebElement SearchBy= driver.findElement(By.id("ddlSearchType"));
	Select ss = new Select(SearchBy);
//	Select Search By
	ss.selectByVisibleText("Customer Code");
//	Enter search value
	driver.findElement(By.id("txtSearchdetails")).sendKeys("256398");
//	Click n search 
	driver.findElement(By.id("BtnSearch")).click();

	}

}




