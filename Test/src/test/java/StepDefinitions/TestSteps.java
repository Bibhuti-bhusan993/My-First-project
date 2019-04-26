package StepDefinitions;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import POMobjects.Home;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps{
	
	WebDriver dr;
	//Home hm;
	
	@Given("^User in home page$")
	public void user_in_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "E:\\Bibhuti\\Selenium\\Automation\\chromedriver.exe");
		dr = new ChromeDriver();
		dr.get("https://bdgapp.wipro.com/REV_WT_RFC/Home.aspx");
//		dr.manage().window().maximize();
		Thread.sleep(10000);
		/*Robot rb = new Robot();
		rb.keyPress(KeyEvent.VK_W);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_P);
		rb.keyPress(KeyEvent.VK_R);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_BACK_SLASH);
		rb.keyPress(KeyEvent.VK_B);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_3);
		rb.keyPress(KeyEvent.VK_8);
		rb.keyPress(KeyEvent.VK_9);
		rb.keyPress(KeyEvent.VK_4);
		rb.keyPress(KeyEvent.VK_0);
		rb.keyPress(KeyEvent.VK_6);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_S);
		rb.keyPress(KeyEvent.VK_CAPS_LOCK);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_SPACE);
		rb.keyRelease(KeyEvent.VK_CAPS_LOCK);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_R);
		rb.keyPress(KeyEvent.VK_CAPS_LOCK);
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_M);
		rb.keyPress(KeyEvent.VK_AT);
		rb.keyPress(KeyEvent.VK_0);
		rb.keyPress(KeyEvent.VK_7);
		rb.keyRelease(KeyEvent.VK_CAPS_LOCK);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_ENTER);*/
		
	    
	}

	@When("^user click on look upload button$")
	public void user_click_on_look_upload_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Home hm = new Home(dr);
//		dr.switchTo().frame("mainFrame");
//		Click on Lookup Upload
	   hm.lookUpUload();
	}

	@When("^user enter the file name$")
	public void user_enter_the_file_name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user click on load$")
	public void user_click_on_load() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^User click on home$")
	public void user_click_on_home() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}



	
	
}