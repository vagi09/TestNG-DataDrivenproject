package TestNGpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class freeCRMLogIn {
	WebDriver driver;

	@BeforeMethod(description = "Launching the URL")
	public void setUp() {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");

	}

	@Test(priority=1)
	public void verifyClickLogInPage() {

		driver.findElement(
				By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
	}
	
	@Test(priority=2)
	public void verifyLogDetails() {
		
		driver.findElement(By.cssSelector("input[placeholder='E-mail address']")).sendKeys("admin");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("admin");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		
	}
	

	
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	
}
