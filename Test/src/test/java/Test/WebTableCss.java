package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableCss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://demo.guru99.com/test/web-table-element.php");
		WebElement table = dr.findElement(By.cssSelector("table[class='dataTable']"));
//		get row count
		int rowCount = table.findElements(By.cssSelector("table[class='dataTable'] tbody tr")).size();
		System.out.println(rowCount);
//		get column count
		int count = table.findElements(By.cssSelector("table[class='dataTable'] tbody tr td")).size();
//		Use loop to get data from each column 
		for(int i=0;i<count;i++){
			
			String text= table.findElements(By.cssSelector("table[class='dataTable'] tbody tr td:nth-child(1)")).get(i).getText();
			System.out.println(text);
		}
		

	}

}
