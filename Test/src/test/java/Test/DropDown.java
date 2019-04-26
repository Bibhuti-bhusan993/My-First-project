package Test;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	WebDriver dr ;
	
@Test
 public void dropdown(){
	
	System.setProperty("webdriver.gecko.driver", "E:\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
	dr =new FirefoxDriver();
//Lunch application
	dr.get("http://toolsqa.com/automation-practice-form/");
	Select sel = new Select(dr.findElement(By.xpath("//select[@id='selenium_commands']")));
//	Scenario 1
/*//	Select by visible text
	sel.selectByVisibleText("Browser Commands");
//	Select  by index
	sel.selectByIndex(2);
//	Select by value
//	sel.selectByValue("Switch Commands");
//	Deselect by visible text
	sel.deselectByVisibleText("Switch Commands");
// Deselect by  index
    sel.deselectByIndex(2);
//	Deselect by value
//    sel.deselectByValue("Browser Commands");	
*/   
//    Scenario 2
//  Select multiple value in dropdown
//  First check whether the drop down in single select or multiple select drop down
   /* if(sel.isMultiple()){
//    Get all values from drop down 
    	List<WebElement> dropdowsvalue = sel.getOptions();
//    	Get dd size
    	int ddsize= dropdowsvalue.size();
    	for(int i =0; i<ddsize;i++){
    		sel.selectByIndex(i);
    	}
    	
    	
    }
//    Get first selcted value 
    WebElement wb = sel.getFirstSelectedOption();
    System.out.println(wb.getText());
//    Get all selected value
    List<WebElement> ls = sel.getAllSelectedOptions();
    int allselectedvalue = ls.size();
    System.out.println(allselectedvalue);
//    deselect all selected value
    sel.deselectAll();
    */
//    
	
//	Scenario 3
//	Select the given value in the drop down
//	Get all the values from dropdown
	List<WebElement> dropdowsvalue = sel.getOptions();
//	Get dd size
	int ddsize= dropdowsvalue.size();
	String expectedvalue = "Switch Commands";
	for(int i = 0; i<ddsize;i++){
		String actualvalue = dropdowsvalue.get(i).getText();
//		Select the value
		if(expectedvalue.equalsIgnoreCase(actualvalue)){
			sel.selectByIndex(i);
			
		}
	}
	
	

	
}

}
