package TestNGpractice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class demo2 {

	@Test(groups= {"smoke"})
	public void simple1() {

		System.out.println("simple1");

	}

	@Test(enabled=false)
	public void simple2() {

		System.out.println("simple2");

	}

	@Test(description="Testcase2")
	public void simple3() {

		System.out.println("simple3");

	}

	@Test(priority=1)
	public void simple4() {

		System.out.println("simple4");

	}

}
