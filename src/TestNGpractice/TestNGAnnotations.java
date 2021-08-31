package TestNGpractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {
	
	@Test
	 public void testCase1() {
	 
	 System.out.println("This is the A Normal Test Case"); //5th
	 
	 }
	 
	 @BeforeMethod
	 
	 public void beforeMethod() {
	 
	 System.out.println("This will execute before every Method"); //4th
	 
	 }
	 
	 @AfterMethod
	 
	 public void afterMethod() {
	 
	 System.out.println("This will execute after every Method"); //6th
	 
	 }
	 
	 @BeforeClass
	 
	 public void beforeClass() {
	 
	 System.out.println("This will execute before the Class"); //3rd
	 
	 }
	 
	 @AfterClass
	 
	 public void afterClass() {
	 
	 System.out.println("This will execute after the Class"); //7th
	 
	 }
	 
	 @BeforeTest
	 
	 public void beforeTest() {
	 
	 System.out.println("This will execute before the Test"); //2nd
	 
	 }
	 
	 @AfterTest
	 
	 public void afterTest() {
	 
	 System.out.println("This will execute after the Test"); //8th
	 
	 }
	 
	 @BeforeSuite
	 
	 public void beforeSuite() {
	 
	 System.out.println("This will execute before the Test Suite"); // 1st
	 
	 }
	 
	 @AfterSuite
	 
	 public void afterSuite() { //9th
	 
	 System.out.println("This will execute after the Test Suite");
	 
	 }

}
