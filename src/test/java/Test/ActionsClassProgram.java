package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class ActionsClassProgram {
	
	static WebDriver dr;
	
	public static void fun(){


		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "F:\\E Drive\\Bibhuti\\Desktop\\Questions\\geckodriver.exe");
		dr = new FirefoxDriver();
		dr.get("https://ksrtc.in/oprs-web/");
		WebDriverWait wt = new WebDriverWait(dr,20);
		Actions act = new Actions(dr);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.name("fromPlaceName")));
		WebElement textBox = dr.findElement(By.name("fromPlaceName"));
//		Write in capital 
		act.moveToElement(textBox).click().keyDown(Keys.SHIFT).sendKeys("beng").build().perform();
//		Delete letters 
//		act.moveToElement(textBox).click().keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.DELETE).perform();
		textBox.sendKeys(Keys.ARROW_DOWN);
//		get the selected value 
		JavascriptExecutor js = (JavascriptExecutor)dr;
		String script = "return document.getElementById('fromPlaceName').value";
		String actualtext = (String) js.executeScript(script);
		System.out.println(actualtext);
		int i =0;
		while (!actualtext.equalsIgnoreCase("BENGALURU AIRPRT")) {
			i++;
			textBox.sendKeys(Keys.ARROW_DOWN);
			actualtext = (String) js.executeScript(script);
			System.out.println(actualtext);
			if(i>10){
				break;
			}
		}
		if(i>10){
			System.out.println("Element not found");
		}
		else {
			System.out.println("element selected");
		}
		int j=0;
		textBox.sendKeys(Keys.ENTER);
		WebElement totextbox = dr.findElement(By.name("toPlaceName"));
		String toscript = "return document.getElementById('toPlaceName').value";
		String toactualtext = (String) js.executeScript(script);
		totextbox.sendKeys("goa");
		while(!toactualtext.equals("PANAJI GOA")){
			j++;
			totextbox.sendKeys(Keys.ARROW_DOWN);
			toactualtext=(String)js.executeScript(toscript);
			System.out.println(toactualtext);
			if(j>10){
				break;
			}
			
		}
		if(j>10){
			System.out.println("Element not found");
		}
		else {
			System.out.println("element selected");
		}
		
		
		
	
	}
	public static void dragAndDrop(){
		System.setProperty("webDriver.chrome.driver", "F:\\E Drive\\Bibhuti\\Selenium\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://demo.guru99.com/test/drag_drop.html");
		WebDriverWait wt = new WebDriverWait(dr,20);
		wt.until(ExpectedConditions.titleIs("Drag and Drop Action"));
		Actions act = new Actions(dr);
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='fourth']/a/text()")));
		WebElement source = dr.findElement(By.xpath("//*[@id='fourth']/a"));
		WebElement destination = dr.findElement(By.id("amt7"));
		act.dragAndDrop(source, destination).perform();
	}

	public static void main(String[] args) throws InterruptedException {
//		dragAndDrop();
//		fun();
		List <String>lis = (List<String>) dr.getWindowHandles();

	}

}
