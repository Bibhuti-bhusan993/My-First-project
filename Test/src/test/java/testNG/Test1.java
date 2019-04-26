package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(groups={"smoke","rr"})
	public void test(){
		System.out.println("test");
	}
	@Test(dependsOnMethods="test",groups="smoke")
	public void test1(){
		System.out.println("test1");
	}
	@BeforeClass
	public void beforeClass(){
		System.out.println("before Class");
		
	}
	@BeforeTest
	public void bt(){
		System.out.println("before Test");
	}
	@BeforeMethod
	public void bm(){
		System.out.println("before method");
	}
	@BeforeGroups
	public void group(){
		System.out.println("group");
	}

}
