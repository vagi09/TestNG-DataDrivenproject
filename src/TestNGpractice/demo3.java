package TestNGpractice;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class demo3 {
	
	@Test
	public void test1() {
		
		System.out.println("TestNG");
	}
	
	
	@AfterTest(groups= {"smoke"})
	public void test2() {
		
		System.out.println("Testing Next Generation");
		
		}
	
	@Test
	public void test3() {
		
		System.out.println("It generate Reports of pass,fail, skip");
		
		}
	@Test
	public void test4() {
		
		System.out.println("It uses Annotations to prioritize the tests");
		
		}
}
