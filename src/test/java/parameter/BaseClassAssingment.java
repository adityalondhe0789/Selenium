package parameter;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClassAssingment {

	WebDriver driver;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("connecting to the database");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Precondition for test Runner");
	}
	@Parameters("url")
	@BeforeClass
	public void beforeClass(String url) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	@Parameters({"username","password"})
	@BeforeMethod
	public void beforeMethod(String username,String password) {
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
		driver.findElement(By.id("Email")).sendKeys(username);
		driver.findElement(By.id("Password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	@AfterMethod
	public void afterMethod() {
		 driver.findElement(By.xpath("//a[text()='Log out']")).click();
		  
	}
	@AfterClass
	public void afterClass() {
		  driver.close();	
		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("postCondition of test runner");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("disconnecting to the database");
	}


}
