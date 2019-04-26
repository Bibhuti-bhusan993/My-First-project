package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandel {
	
	static WebDriver dr;
	
	public static void window() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "F:\\E Drive\\Bibhuti\\Selenium\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("http://demo.guru99.com/popup.php");
		Thread.sleep(30000);
		dr.findElement(By.xpath("//a[text()='Click Here']")).click();
		List<String>lis = (List<String>)dr.getWindowHandles();
		String s = lis.get(1);
		String s1 = lis.get(2);
		dr.switchTo().window(s1);
		dr.findElement(By.name("emailid")).sendKeys("sdfsg");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	    window();

	}

}
