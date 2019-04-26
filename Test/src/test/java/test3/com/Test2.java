package test3.com;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test2 {
	/*@BeforeClass
	public void beforeClass(){
		System.out.println("@BeforeClass-tes2 class");
		
	}*/
	@Test(groups="smoke")
	public void f(){
		System.out.println("test2 class f method");
		
	}
	public void c(){
		System.out.println("test2 class c method");
	}
	@Test(groups="smoke")
	public void d(){
		System.out.println("test2 class d method");
	}
	/*@BeforeMethod
	public void beforeMethod(){
		System.out.println("test2 class before method");
	}*/

}
