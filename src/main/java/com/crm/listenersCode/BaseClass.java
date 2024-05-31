package com.crm.listenersCode;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

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

public class BaseClass {

	
	public WebDriver driver;
	Properties prop;
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("connecting to the database");
	}
	@BeforeTest
	public void beforeTest() {
		System.out.println("Precondition for test Runner");
	}
	
	@BeforeClass
	public void beforeClass() throws IOException {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		prop=new Properties();
		FileInputStream fis= new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\com.crm.AdvancedSelenium\\src\\test\\resources\\DemoWebShop\\Login.properties");
		prop.load(fis);
		String url=prop.getProperty("url");
		
		driver.get(url);
	}
	
	@BeforeMethod
	public void beforeMethod() throws IOException {
		driver.findElement(By.xpath("//a[contains(text(),'Log in')]")).click();
//		prop=new Properties();
//		FileInputStream fis= new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\com.crm.AdvancedSelenium\\src\\test\\resources\\DemoWebShop\\Login.properties");
//		prop.load(fis);
//	    String username1 = prop.getProperty("username");
//	    String password1 = prop.getProperty("password");
		
		String username=prop.getProperty("username");
		String password=prop.getProperty("password");
		
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
