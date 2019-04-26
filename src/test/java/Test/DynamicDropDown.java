package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","E:\\Bibhuti\\Desktop\\Selenium\\geckodriver.exe");
		
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.spicejet.com/");
//		Click on from
		dr.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		select place
		dr.findElement(By.xpath("//a[@value='GOI']")).click();
//		Click on to
		dr.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
//		Select place
		dr.findElement(By.xpath("(//a[text()=' Kolkata (CCU)'])[2]")).click();
		dr = new FirefoxDriver();
		dr.get("https://www.makemytrip.com/flights?gclid=EAIaIQobChMI2KCPq5zt3gIVToiPCh1DIQHzEAAYASAAEgJK__D_BwE&cmp=SEM%7CD%7CDF%7CG%7CBrand%7CB_M_Makemytrip_Search_Exact%7CBrand_Top_5_Exact%7CExpanded%7C262047047495&s_kwcid=AL!1631!3!262047047495!e!!g!!make%20my%20trip&ef_id=EAIaIQobChMI2KCPq5zt3gIVToiPCh1DIQHzEAAYASAAEgJK__D_BwE%3AG%3As");
		dr.findElement(By.id("hp-widget__sfrom")).click();
		dr.findElement(By.xpath("//span[text()='New Delhi, India ']")).click();
		dr.findElement(By.id("hp-widget__sTo")).click();
		dr.findElement(By.xpath("(//span[text()='Mumbai, India '])[2]")).click();
		
		

	}

}
