package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test3 {
	WebDriver dr;
	@BeforeTest
	public void bt(){
		System.out.println("before test3");
	}
	@Test
	public void tt(){
		System.out.println("BeforeTest-test3");
	}
	@BeforeSuite
	public void bs (){
		System.out.println("@BeforeSuite");
	}
	@Test
	public void ff(){
		System.out.println("chrome");
		System.setProperty("webdriver.gecko.driver", "F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
		dr = new ChromeDriver();
		
	}
	

}
