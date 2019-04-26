package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JsExecutor {
	
public static void main(String args[]){

	System.setProperty("webdriver.gecko.driver","F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Hello");
	WebElement button = driver.findElement(By.name("btnK"));
//	Click on the button using java script 
    JavascriptExecutor js =(JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();",button);
   

	
}

}
