package testNG;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test2 {
	@BeforeClass
	public void beforeClass(){
		System.out.println("@BeforeClass-tes2 class");
		
	}
	@Test
	public void test(){
		System.out.println("test-test2 class");
	}
	@Test
	public void test1(){
		System.out.println("test1-test2 class");
	}

}
