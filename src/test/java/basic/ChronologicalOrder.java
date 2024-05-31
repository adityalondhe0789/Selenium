package basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {

	@BerforeSuite
	public void beforeSuite() 
	{
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void beforeTest() 
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before Methods");
	}
	
	@Test
	public void beforeTestCase()
	{
		System.out.println("before Test1");
	}
	
	
	
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("After Class");
	}
	
	@AfterSuite
	public void afterSuite() 
	{
		System.out.println("After suite");
	}
	@Test
	public void beforeTestCase1()
	{
		System.out.println("before Test2");
	}
	
	@AfterTest
	public void afterTest() 
	{
		System.out.println("After Test");
	}
	
	
	}

