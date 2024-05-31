package dataDrivenTesting;

import  java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import basic.BerforeSuite;
public class Hw1BaseClass {



	WebDriver driver;
	@BerforeSuite
	public void beforeSuite() 
	{
		System.out.println("DATABASE CONNECTED");
	}
	
	@BeforeTest
	public void beforeTest() 
	{
		
	}
	
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(4000);
	}
	
	@BeforeMethod
	public void beforeMethod(String gmail,String pwd)
	{
		
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(gmail);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
	}
	
	
	
	
	
	@AfterMethod
	public void afterMethod()
	{
        
        
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


