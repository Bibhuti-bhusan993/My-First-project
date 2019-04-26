package POMobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	WebDriver dr;
	
	public Home(WebDriver dr){
		
		this.dr=dr;
		PageFactory.initElements(dr,this);
	}
	
	@FindBy(id="btnlockupupload")
	WebElement lookUpUploadButton;
	
	@FindBy(name="FileLockUpUpload")
	WebElement chooseFile;
	
	@FindBy(name="btnConfrim")
	WebElement loadButton;
	
	@FindBy(id="HomeuserControl_hplHome")
	WebElement home;
	
	public void lookUpUload(){
		dr.switchTo().frame("mainFrame");
		lookUpUploadButton.click();
	}
	public void chooseFile(){
chooseFile.sendKeys("C:\\Users\\bi389406\\Desktop\\RA\\LookUp_Details");
		
	}
	public void clickOnload() throws InterruptedException{
loadButton.click();
		
		Thread.sleep(5000);
	}
	public void clickonhome(){
		home.click();
	}

}
