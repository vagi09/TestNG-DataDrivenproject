package TestNGpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class demo4 {

	@Test
	public void Beforemethod() {

		System.out.println("This is executed before every method");
	}

	@Test
	public void Beforemethod1() {

		System.out.println("It is okay");
	}

	@Test
	public void Beforemethod2() {

		System.out.println("to try and");
	}

	@Test
	public void Beforemethod3() {

		System.out.println("fail, so you learn");
	}

	@Test(groups= {"smoke"})
	public void Beforemethod4() {

		System.out.println("That is what");
	}

	@Test
	public void Beforemethod5() {

		System.out.println("called a life");
	}
	
	@Test
	public void Beforemethod6() {

		System.out.println("Why do we Fall?");
	}
	
	@Test
	public void Beforemethod7() {

		System.out.println("So we learn to pick ourselves up");
	}
}
