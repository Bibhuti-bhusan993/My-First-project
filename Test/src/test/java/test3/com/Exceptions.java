package test3.com;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Exceptions {
	
	public void hello(float h){
		String s=" Omm.sai Omm ";
		s=s.trim()+"hello";
		System.out.println(System.getProperty("user.dir"));
		System.out.println(System.getProperty("os.name"));	
		System.out.println(System.getProperty("java.runtime.version"));	
		System.out.println(System.getProperty("maven.version"));
		
	}
	public static void main(String gg[]){
		
		new Exceptions().hello(67);

	}

}
