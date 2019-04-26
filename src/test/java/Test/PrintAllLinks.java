package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintAllLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\E Drive\\Bibhuti\\Selenium\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demo.guru99.com/test/web-table-element.php");
		Thread.sleep(15000);
		List alls = dr.findElements(By.xpath("//a"));
		System.out.println(alls.size());

	}

}
