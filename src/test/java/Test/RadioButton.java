package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.sun.jna.platform.win32.WinRas.RASTUNNELENDPOINT;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\E Drive\\Bibhuti\\Desktop\\Selenium\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("http://toolsqa.com/automation-practice-form/");
//		Select the given radio button
		String expected_result = "6";
		int radiobutton_size = dr.findElements(By.name("exp")).size();
		for(int i =0;i<radiobutton_size;i++){
			String actul_result = dr.findElements(By.name("exp")).get(i).getAttribute("value");
			System.out.println(actul_result);
			if(expected_result.equals(actul_result)){
				dr.findElements(By.name("exp")).get(i).click();
				System.out.println(dr.findElements(By.name("exp")).get(i).isSelected());
				break;
			}
			else {
				System.out.println("Radio button is not selcted");
			}
		}

	}

}
