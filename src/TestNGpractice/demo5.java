package TestNGpractice;

import org.testng.annotations.Test;

public class demo5 {

	@Test(priority=1, description="T1")
	public void TestCase5() {

		System.out.println("This is Test case5");
	}

	@Test(priority=2, description="T2")
	public void TestCase4() {

		System.out.println("This is Test case4");
	}
//	Thread.sleep(3000);

	@Test(priority=3, description="T3", enabled=true)
	public void TestCase3() {

		System.out.println("This is Test case3");
	}

	@Test(priority=4, description="T4")
	public void TestCase2() {

		System.out.println("This is Test case2");
	}

	@Test(priority=5, description="T5")
	public void TestCase1() {

		System.out.println("This is Test case1");
	}

}
