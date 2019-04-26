package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities ds = DesiredCapabilities.firefox();
		ds.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		FirefoxOptions ff = new FirefoxOptions();
		System.setProperty("webdriver.gecko.driver","F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://bdgapp.wipro.com/REV_WT_RFC/Home.aspx");

	}

}
