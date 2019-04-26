package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyPestinActionClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("https://wipfs01.wipro.com/adfs/ls/?wa=wsignin1.0&wtrealm=https%3a%2f%2fmywipro.wipro.com%2f&wctx=rm%3D0%26id%3Dpassive%26ru%3D%252F%26wtc%3D3%252F19%252F2019%252012%253A25%253A56%2520PM");
		Thread.sleep(3000);
		WebElement element = dr.findElement(By.xpath("//span[text()='© 2014 Microsoft']"));
		Actions act = new Actions(dr);
		act.moveToElement(element).doubleClick().sendKeys(Keys.chord(Keys.CONTROL,"c")).build().perform();
		WebElement em = dr.findElement(By.name("UserName"));
		act.moveToElement(em).click().sendKeys(Keys.chord(Keys.CONTROL,"v")).build().perform();
		
		
		

	}

}
