package Test;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestLocators {
//	
	@Test
	public void test1() throws InterruptedException{
		
		System.setProperty("webdriver.gecko.driver","E:\\Bibhuti\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		System.out.println(dr.findElements(By.className("_1nwamC required-tracking")).size());
		dr.findElement(By.linkText("/books/pr?sid=bks&offer=nb:mp:100b193f22&fm=neo%2Fmerchandising&iid=M_b0e088ab-4eb2-4d4e-8e3a-470fd2e002ec_3.UBLTLIJM7LN4&ppt=Homepage&ppn=Homepage&otracker=hp_omu_Deals%2Bof%2Bthe%2BDay_1_Min%2B"
				+ "30%2525%2BOff_UBLTLIJM7LN4_0&cid=UBLTLIJM7LN4")).click();;
	
	    
	}
	
	
}



