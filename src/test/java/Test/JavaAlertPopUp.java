package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaAlertPopUp {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","E:\\Bibhuti\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
//		Handle java alert pop up 
		dr.get("http://demo.guru99.com/test/delete_customer.php");
		dr.findElement(By.name("submit")).click();
		dr.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println(dr.switchTo().alert().getText());
		dr.switchTo().alert().accept();
//		Click on calcel on the alret pop up
//		dr.switchTo().alert().dismiss();
//		Enter something on the alret pop up
//		dr.switchTo().alert().sendKeys("Hello");

	}

}
