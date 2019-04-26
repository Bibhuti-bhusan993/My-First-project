package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
			dr.get("https://jqueryui.com/droppable/");
			Thread.sleep(20000);
			WebElement frame = dr.findElement(By.xpath("//iframe[@class='demo-frame']"));
			dr.switchTo().frame(frame);
			WebElement src = dr.findElement(By.xpath("//div[@class='ui-widget-content ui-draggable ui-draggable-handle']"));
			WebElement dst = dr.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable']"));
			Actions act = new Actions(dr);
			act.dragAndDrop(src, dst).perform();

	}

}
