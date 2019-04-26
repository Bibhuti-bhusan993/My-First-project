package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.myntra.com/men-tshirts");
		dr.findElement(By.xpath("//img[@title='HERE&NOW Men Navy Blue & Grey Striped Round Neck T-shirt']")).click();
		Thread.sleep(3000);
		dr.quit();

	}

}
