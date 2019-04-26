package Test;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToTab {
	static WebDriver driver;
	
	/*public void openTab() {
		  System.setProperty("webdriver.chrome.driver", "F:\\E Drive\\Bibhuti\\Selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("http://only-testing-blog.blogspot.in/2014/04/calc.html");
		  //Open tab 2 using CTRL + t keys.
		  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		  //Open URL In 2nd tab.
		  driver.get("http://only-testing-blog.blogspot.in/2014/05/form.html");
		  
		  //Call switchToTab() function to switch to 1st tab
		  switchToTab();
		  //perform required actions on tab 1.
		  driver.findElement(By.xpath("//input[@id='6']")).click();
		  driver.findElement(By.xpath("//input[@id='plus']"));
		  driver.findElement(By.xpath("//input[@id='3']"));
		  driver.findElement(By.xpath("//input[@id='equals']"));
		  
		  //Call switchToTab() function to switch to 2nd tab.
		  switchToTab();
		  //perform required actions on tab 2.
		  driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("hi");
		  driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("test");
		  
		  //Call switchToTab() function to switch to 1st tab
		  switchToTab();
		  //perform required actions on tab 1.
		  String str = driver.findElement(By.xpath("//input[@id='Resultbox']")).getAttribute("value");
		  System.out.println("Sum result Is -> "+str);
		 } 
		 
		 public static void switchToTab() {
		  //Switching between tabs using CTRL + tab keys.
		  driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"\t");
		  //Switch to current selected tab's content.
		  driver.switchTo().defaultContent();  
		 }*/

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		  System.setProperty("webdriver.chrome.driver", "F:\\E Drive\\Bibhuti\\Selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  Thread.sleep(10000);
		  driver.get("https://www.yesbank.in/");
		  Thread.sleep(9000);
		  driver.findElement(By.xpath("//a[text()='Login']")).click();
		  Thread.sleep(9000);
		  driver.findElement(By.id("retail-disclaimer-credit-cards")).click();
		  Thread.sleep(3000);
		  driver.findElement(By.xpath("//input[@value='Get Started > >']")).click();
		  ArrayList<String> al = new ArrayList<String> (driver.getWindowHandles());
		  driver.switchTo().window(al.get(1));
		  driver.findElement(By.xpath("//a[@onclick='javascript:ContinuePage();']")).click();
		  
		  
		

	}

}
