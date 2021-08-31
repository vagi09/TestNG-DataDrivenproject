package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTest {

	public static void main(String[] args) throws InterruptedException {

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\VAGI\\eclipse-workspace\\TestNGTutorial\\src\\com\\testdata\\Inputfrom.xlsx");

		String firstname = reader.getCellData("Regform", "FirstName", 2);
//		System.out.println(firstname);

		String lastname = reader.getCellData("Regform", "lastname", 2);
//		System.out.println(lastname);

		String email = reader.getCellData("Regform", "email", 2);
//		System.out.println(email);

		String phone = reader.getCellData("Regform", "phone", 2);
//		System.out.println(phone);

		String adress = reader.getCellData("Regform", "adress", 2);
//		System.out.println(adress);

		String city = reader.getCellData("Regform", "city", 2);
//		System.out.println(city);

		String state = reader.getCellData("Regform", "state", 2);
//		System.out.println(state);

		String zipcode = reader.getCellData("Regform", "zipcode", 2);
//		System.out.println(zipcode);

		String domain = reader.getCellData("Regform", "domainname", 2);
//		System.out.println(domain);

		String projdes = reader.getCellData("Regform", "projdes", 2);
//		System.out.println(projdes);

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
		driver.findElement(By.xpath("//input[@name='address']")).sendKeys(adress);
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
		Thread.sleep(3000);
		try {
			Select select = new Select(driver.findElement(By.xpath("//select[@name='state']")));
			select.selectByVisibleText(state);
		} catch (Exception e) {
			
		}
		
		driver.findElement(By.xpath("//input[@name='zip']")).sendKeys(zipcode);
		driver.findElement(By.xpath("//input[@name='website']")).sendKeys(domain);
		driver.findElement(By.xpath("//input[@value='yes']")).click();
		driver.findElement(By.xpath("//textarea[@placeholder='Project Description']")).sendKeys(projdes);
		driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();

	}

}
