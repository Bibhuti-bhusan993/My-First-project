package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Checkbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver", "F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
WebDriver dr = new ChromeDriver();
dr.get("http://toolsqa.com/automation-practice-form/");
WebDriverWait wt = new WebDriverWait(dr,40);
wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("tool")));
//Scenario 1
//Get all check values
int size=dr.findElements(By.name("tool")).size();
//Select all the check boxs
for(int i =0;i<size;i++){
	dr.findElements(By.name("tool")).get(i).click();
}

// Scenario 2
//Get all check values
/*List<WebElement> checkboxsize=dr.findElements(By.name("tool"));
//Select the expected check box
String expected = "Selenium IDE";
for(int i =0;i<checkboxsize.size();i++){
String actualtext= checkboxsize.get(i).getAttribute("value");
System.out.println(actualtext);
if(expected.equals(actualtext)){
	checkboxsize.get(i).click();
	break;
}
}
*/

	}

}
