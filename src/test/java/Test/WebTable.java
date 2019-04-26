package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "F:\\E Drive\\Bibhuti\\Selenium\\chromedriver.exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demo.guru99.com/test/web-table-element.php");
		WebDriverWait wait = new WebDriverWait(dr,20);
		wait.until(ExpectedConditions.titleIs("Web Table Elements"));
		WebElement table = dr.findElement(By.xpath("//table[@class='dataTable']"));
		int rowCount = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
		int columnCount = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td")).size();
		List alls = dr.findElements(By.xpath(""));
		
		for(int i=0;i<columnCount;i++){
			
			String companyName= table.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td")).get(i).getText();
			System.out.println(companyName);
			if(companyName.equals("Jet Airways")){
				table.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td")).get(i).click();
				
			}
			
		}

	}

}
