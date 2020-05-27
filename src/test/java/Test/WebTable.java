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
		
		System.setProperty("webdriver.chrome.driver", "D://Drivers//chromedriver (2).exe");
		WebDriver dr = new ChromeDriver();
		dr.get("http://demo.guru99.com/test/web-table-element.php");
		WebDriverWait wait = new WebDriverWait(dr,20);
		wait.until(ExpectedConditions.titleIs("Web Table Elements"));
		List<WebElement> columns = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		
		for(int i=0;i<columns.size();i++){
			String companyName= columns.get(i).getText();
			System.out.println(companyName);
			List<WebElement> popUp = dr.findElements(By.xpath("//*[@id='transparentInner']"));
			System.out.println(popUp.size());
			if(popUp.size()==0){
				wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id("closeBtn")));
				dr.findElement(By.xpath("//*[@id='closeBtn']")).click();
			}
			if(companyName.equals("Dewan Housing")){
				columns.get(i).click();
				
			}
			
		}

	}

}
