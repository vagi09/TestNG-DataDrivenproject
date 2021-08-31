package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.excel.utility.Xls_Reader;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizeTest {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");

		Xls_Reader reader = new Xls_Reader(
				"C:\\Users\\VAGI\\eclipse-workspace\\TestNGTutorial\\src\\com\\testdata\\Inputfrom1.xlsx");
		int rowcount = reader.getRowCount("Regform");

		for (int rownum = 2; rownum <= rowcount; rownum++)

		{
			String firstname = reader.getCellData("Regform", "FirstName", rownum);

//			System.out.println(firstname);

			String lastname = reader.getCellData("Regform", "lastname", rownum);
//			System.out.println(lastname);

			String email = reader.getCellData("Regform", "email", rownum);
//			System.out.println(email);

			String phone = reader.getCellData("Regform", "phone", rownum);
//			System.out.println(phone);

			String adress = reader.getCellData("Regform", "adress", rownum);
//			System.out.println(adress);

			String city = reader.getCellData("Regform", "city", rownum);
//			System.out.println(city);

			String state = reader.getCellData("Regform", "state", rownum);
//			System.out.println(state);

			String zipcode = reader.getCellData("Regform", "zipcode", rownum);
//			System.out.println(zipcode);

			String domain = reader.getCellData("Regform", "domainname", rownum);
//			System.out.println(domain);

			String projdes = reader.getCellData("Regform", "projdes", rownum);
//			System.out.println(projdes);

			driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();

			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(firstname);

			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(lastname);

			driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).clear();
			driver.findElement(By.xpath("//input[@placeholder='E-Mail Address']")).sendKeys(email);

			driver.findElement(By.xpath("//input[@name='phone']")).clear();
			driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);

			driver.findElement(By.xpath("//input[@name='address']")).clear();
			driver.findElement(By.xpath("//input[@name='address']")).sendKeys(adress);

			driver.findElement(By.xpath("//input[@name='city']")).clear();
			driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
			Thread.sleep(3000);

			try {
				Select select = new Select(driver.findElement(By.xpath("//select[@name='state']")));
				select.selectByVisibleText(state);
			} catch (Exception e) {
				
			}

			driver.findElement(By.xpath("//input[@name='zip']")).clear();
			driver.findElement(By.xpath("//input[@name='zip']")).sendKeys(zipcode);

			driver.findElement(By.xpath("//input[@name='website']")).clear();
			driver.findElement(By.xpath("//input[@name='website']")).sendKeys(domain);
			driver.findElement(By.xpath("//input[@value='yes']")).click();

			driver.findElement(By.xpath("//textarea[@placeholder='Project Description']")).clear();
			driver.findElement(By.xpath("//textarea[@placeholder='Project Description']")).sendKeys(projdes);
			driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
		}

	}

}
