package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://demo.guru99.com/test/web-table-element.php");
//		Identify table
		WebElement table = dr.findElement(By.xpath("//table[@class='dataTable']"));
//		Get row count 
		int rowcount = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
//		Get column count 
		int column_count = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td")).size();
//		Use loop to get the all column value 
		for(int i=1; i<=rowcount;i++){
			dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td"));
			System.out.println("");
			for(int j=0;j<column_count;j++){
			String text = dr.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td")).get(j).getText();
			System.out.print(text+" ");
			
			}
		}

	}

}
