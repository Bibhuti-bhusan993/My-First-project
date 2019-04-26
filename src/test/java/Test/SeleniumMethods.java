package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver","F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.get("https://www.cricbuzz.com/live-cricket-scorecard/20303/aus-vs-ind-3rd-test-india-tour-of-australia-2018-19");
		String ss = dr.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		System.out.println(ss);
		dr.findElement(By.xpath("//a[@class='cb-mat-mnu-itm cb-ovr-flo'][1]")).click();
		System.out.println(dr.getTitle());
//		dr.navigate().back();
//		System.out.println(dr.getTitle());
//		dr.navigate().refresh();
//		System.out.println(dr.getTitle());
//		dr.navigate().forward();
//		System.out.println(dr.getTitle());
//		System.out.println(dr.getCurrentUrl());
//		System.out.println(dr.getPageSource());
//		System.out.println(dr.manage().getCookies());
		
		
	}

}
