package freeCRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class freeCMR {
	
	WebDriver driver;
	
	@BeforeMethod(description="Launching the URL")
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
	public void verifyPageTitleTest() {
		String title= driver.getTitle();
		System.out.println("Page Title is"+ title);
		Assert.assertEquals(title, "#1 Free CRM customer relationship management software cloud");
		
		}
	
	@Test(priority=2)
	public void verifyThePageLogo() {
		
	boolean flag=	driver.findElement(By.xpath("//div[@class='rd-navbar-brand']//a[@title='free crm home']")).isDisplayed();
		Assert.assertTrue(flag);
		
	}
	
//	@Test
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		driver.close();
	}
	

}
