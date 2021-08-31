package TestNGpractice;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class Demo1 {

	@AfterSuite
	public void day1() {

		System.out.println("Day1");

	}

	@BeforeClass
	public void day2() {

		System.out.println("Day2");

	}

	@BeforeTest
	public void day3() {

		System.out.println("Day3");

	}

	@BeforeSuite
	public void day4() {

		System.out.println("Day4");
	}
}
