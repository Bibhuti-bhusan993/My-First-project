package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chromr.driver","F:\\E Drive\\Bibhuti\\Selenium\\chromedriver.exe");
		
		WebDriver dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.facebook.com/");
		dr.findElement(By.className("inputtext")).sendKeys("hello");

	}

}
