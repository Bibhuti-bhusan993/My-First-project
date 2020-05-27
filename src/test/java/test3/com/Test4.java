package test3.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import junit.framework.Assert;

public class Test4 {
	
	@Test(enabled=false)
	public void test() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:\\E Drive\\Bibhuti\\Selenium\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		Actions act = new Actions(dr);
		dr.get("https://www.google.com/webhp?hl=en&ictx=2&sa=X&ved=0ahUKEwim0LaLtuXhAhVC7HMBHeb-B4YQPQgH");
		Thread.sleep(15000);
		List<WebElement>ls = dr.findElements(By.tagName("a"));
		
		for(int i=0;i<ls.size();i++){
//			String ac = ls.get(i).getText();
			if(!ls.get(i).getText().isEmpty()){
//				act.contextClick(ls.get(i)).sendKeys(Keys.CONTROL +"\t").build().perform();
				ls.get(i).sendKeys(Keys.CONTROL +"t");
				Thread.sleep(2000);
//				act.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
			}
			
			
		}
		
	}
	@Test
	public void tets1() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:\\E Drive\\Bibhuti\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/men-tshirts");
		Thread.sleep(15000);
		 Actions action = new Actions(driver);
		 driver.findElement(By.xpath("//li[@class='product-base'][1]")).click();
		 driver.findElement(By.xpath("//li[@class='product-base'][2]")).click();
		 driver.findElement(By.xpath("//li[@class='product-base'][3]")).click();
		 driver.findElement(By.xpath("//li[@class='product-base'][4]")).click();
		 driver.findElement(By.xpath("//li[@class='product-base'][5]")).click();
		 driver.findElement(By.xpath("//li[@class='product-base'][6]")).click();
		 Thread.sleep(8000);
		 Set<String>ss= driver.getWindowHandles();
		 Iterator<String>it = ss.iterator();
		 int i=0;
		 while( it.hasNext()){
			 String s = it.next();
			 System.out.println(s);
			 i++;
			 if(i==3){
				 System.out.println(i);
				 driver.switchTo().window(s);
				 System.out.println(driver.getTitle());
			 }
		 }
		 SoftAssert sa = new SoftAssert();
		 
			
		 }
		 
		/* // Switch to Second Tab
		 action.keyDown(Keys.CONTROL).sendKeys(Keys.TAB).build().perform();
		 
		 // Switch to First Tab
		 action.keyDown(Keys.CONTROL).keyDown(Keys.SHIFT).sendKeys(Keys.TAB).build().perform();
		 
		 }
		 */
		
	
	
}		

