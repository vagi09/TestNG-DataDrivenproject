package freeCRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class freeCRMLogIn {
	WebDriver driver;

	@BeforeMethod(description = "Launching the URL")
	public void setUp() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");
		// verifyLogDetails("vagi.buddy@gmail.com", "Test90&crm");

	}

	@Test(priority = 2)
	public void verifyClickLogInPage() {

		driver.findElement(
				By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();

	}

	@Test(priority = 1)
	public void verifyLogDetails(String username, String password) throws InterruptedException {

		// driver.findElement(By.cssSelector("input[placeholder='E-mail
		// address']")).sendKeys(username);
		// driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(password);

		// loginbtn
		// WebElement loginbtn = driver.findElement(By.xpath("//a[@class='btn
		// btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']"));
		// JavascriptExecutor js = (JavascriptExecutor)driver;
		// js.executeScript("arguments[0].click();", loginbtn);

		driver.findElement(
				By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		driver.findElement(By.cssSelector("input[placeholder='E-mail address']")).sendKeys("vagi.buddy@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Test90&crm");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		Thread.sleep(5000);

	}

	@AfterMethod
	public void tearDown() {

		driver.close();
	}

}
