package TestNg;

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
import org.testng.annotations.BeforeTest;

import basic.BerforeSuite;

public class BaseClass {

	WebDriver driver;
	@BerforeSuite
	public void beforeSuite() 
	{
		System.out.println("DATABASE CONNECTED");
	}
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("The pre condition for test runner");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://demowebshop.tricentis.com/");

	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("admin01@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("admin01");
		driver.findElement(By.xpath("//input[@id='RememberMe']")).click();
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
	}
	
	
	
	
	
	@AfterMethod
	public void afterMethod()
	{
        driver.findElement(By.xpath("//a[@class='ico-logout']")).click();
        
	}
	
	@AfterClass
	public void afterClass()
	{
		driver.close();
	}

	
	@AfterTest
	public void afterTest() 
	{
		System.out.println("Post condition for test Runner");
	}
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("Disconnect the database");
	}
	
}