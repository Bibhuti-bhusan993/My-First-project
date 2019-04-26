package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTesting {
	
	WebDriver dr;
	//@Parameters("browser")
	@Test
	public void ff(){
		System.out.println("chrome");
		System.setProperty("webdriver.gecko.driver", "F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
		dr = new ChromeDriver();
		
	}
	/*@Test
	public void ch(){
		System.out.println("chrome1");
		System.setProperty("webdriver.gecko.driver", "F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
		dr = new ChromeDriver();
		
	}*/

}
