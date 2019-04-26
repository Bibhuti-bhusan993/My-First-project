package test3.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\E Drive\\Bibhuti\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//table[@class='dataTable']")));
//		To identify the table
		WebElement table= driver.findElement(By.xpath("//table[@class='dataTable']"));
//		To check the row count
		int rowCount = table.findElements(By.xpath("//table[@class='dataTable']/tbody/tr")).size();
//		To check the column count
		int columnCount=table.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td")).size();
		System.out.println(columnCount);
		System.out.println(rowCount);
		
//		Use loop to change the row
		for(int j=1;j<=rowCount;j++){
			
			table.findElements(By.xpath("//table[@class='dataTable']/tbody/tr["+j+"]"));
			System.out.println(j);
//		Use loop to change the column	
		for(int i=1;i<5;i++){
//			To get the data from webtable 
			String act = table.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+j+"]/td["+i+"]")).getText();
			System.out.println(act);
//			To check the equal value
			if(act.equals("DCB Bank")){
				String act1 = table.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+j+"]/td["+i+"]")).getText();
				System.out.println(act1);
				
				if(act1.equals("A")){
					
					String exp = table.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+j+"]/td[3]")).getText();	
					System.out.println(exp);
				break;	
				}				
			}
			else{
				System.out.println("element not found");
			}
			
		}
		}

	}
}


