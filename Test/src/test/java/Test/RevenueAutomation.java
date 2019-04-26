package Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class RevenueAutomation {
	
	WebDriver driver;          
	String PageTitle;
	String uploadfordomain;
	Robot robot;
	StringSelection sel;
	String afterupload;
	WebElement emplyeeNo;
	WebElement vertical;
	WebElement companyCode;
	WebElement adminuser;
    static ScreenShot ss;
	WebDriverWait wait;
	
		
	@org.junit.Test
	public void setCalendar() throws InterruptedException{
		ss = new ScreenShot();
		System.setProperty("webdriver.gecko.driver", "F:\\E Drive\\Bibhuti\\Desktop\\Selenium\\geckodriver.exe");
		//Open Chrome Browser
		driver = new FirefoxDriver();
		// Maximize the browser
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://azfinqa.wipro.com/Revenue_Automation_WT/home.aspx");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		wait = new WebDriverWait(driver, 90);
//		RevenueAutomation.ss.captureScreenShot(driver);
//		Switch to frame.
		driver.switchTo().defaultContent();
		driver.switchTo().frame("mainFrame");
//		RevenueAutomation.ss.captureScreenShot(driver);
//		Click on Change Month
		driver.findElement(By.id("btnFreezUpload")).click();
		Thread.sleep(1000);
		RevenueAutomation.ss.captureScreenShot(driver);
//		Enter Expected Close Date
//		driver.findElement(By.id("txtdate")).sendKeys("10/27/2017");
//		Click on Change Date
		driver.findElement(By.name("btnfreez")).click();
		Thread.sleep(1000);
		RevenueAutomation.ss.captureScreenShot(driver);
		/*Alert contractadded = driver.switchTo().alert();
		RevenueAutomation.captureScreenShot(driver);
		contractadded.accept();
		driver.switchTo().defaultContent();
		Thread.sleep(800);*/
	}
	@org.junit.Test()
	public void lookupUpoad() throws InterruptedException, AWTException{
		driver.switchTo().defaultContent();
		driver.switchTo().frame("topFrame");
//		Click on Home.
		driver.findElement(By.id("HomeuserControl_hplHome")).click();
		driver.switchTo().defaultContent();
//		Switch to frame
		driver.switchTo().frame("mainFrame");
//		Click on Lookup Upload
		driver.findElement(By.id("btnlockupupload")).click();
		Thread.sleep(800);
		RevenueAutomation.ss.captureScreenShot(driver);
//		With out choose file clik on load.
		driver.findElement(By.id("btnConfrim")).click();
		Thread.sleep(800);
//		Capture the message
		Alert alt = driver.switchTo().alert();
		String Message = alt.getText();
		Thread.sleep(1000);
//		Click on Ok.
		alt.accept();
//		Click on Choose file.
		driver.findElement(By.id("FileLockUpUpload")).click();
		Thread.sleep(800);
//		Specify the file location with extension
		 StringSelection sel = new StringSelection("D:\\October\\WBPO\\New folder\\LookUp_Details-31Oct17_WT.xls");			 
//		 Copy to clipboard
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel,null);
		 System.out.println("selection" +sel);
//		 Create object of Robot class
		 robot = new Robot();
		 Thread.sleep(1000);
		 robot.keyPress(KeyEvent.VK_ENTER);
 //      Release Enter
		 robot.keyRelease(KeyEvent.VK_ENTER);
 //      Press
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
//       Release CTRL+V
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 Thread.sleep(1000);
//	     Press Enter 
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(2500);
//		Click on Load.
		driver.findElement(By.id("btnConfrim")).click();
		Thread.sleep(2500);
		RevenueAutomation.ss.captureScreenShot(driver);
//		Capture the sucessful message.
		String uploadMsag = driver.findElement(By.id("lblmesg")).getText();
		System.out.println(uploadMsag);
//		Click on Download LookUp Details.
		driver.findElement(By.id("LinkButton1")).click();
//		Click on Check file.
		driver.findElement(By.id("Chckfile")).click();
		Thread.sleep(800);
//		Capture the text.
		String checkFile = driver.findElement(By.id("lblerrmsge")).getText();
		System.out.println(checkFile);
//		Click on Upload File.
		driver.findElement(By.id("btnupladfle")).click();
		Thread.sleep(800);
		RevenueAutomation.ss.captureScreenShot(driver);
//		Clik on INR Currency
		driver.findElement(By.id("lnkinr")).click();
		Thread.sleep(800);
		RevenueAutomation.ss.captureScreenShot(driver);
//		Click on USD Currency
		driver.findElement(By.id("lnkusd")).click();
		Thread.sleep(800);
		RevenueAutomation.ss.captureScreenShot(driver);
//		Click on All Currency
		driver.findElement(By.id("lnkall")).click();
		Thread.sleep(800);
	
		
	}
	
}