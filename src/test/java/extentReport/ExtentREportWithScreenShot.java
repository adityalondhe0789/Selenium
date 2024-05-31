package extentReport;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import base.BaseClassDws;
@Listeners(com.crm.listenersCode.TakeScreenShotWithExtentReport.class)
public class ExtentREportWithScreenShot extends BaseClassDws{

		@Test
		public void dwsLoginCorrect() 
		{
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			
//			DwsLoginPage dws = new DwsLoginPage(driver);
			
			driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
//			dws.username("admin01@gmail.com");
			
			driver.findElement(By.id("Password")).sendKeys("admin01");
//			dws.password("admin01");
			
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
//			dws.Login_Button();
			
			driver.findElement(By.xpath("//a[text()='Log out']")).click();
		}
		
		@Test
		public void dwsLoginWrong() 
		{
			driver.get("https://demowebshop.tricentis.com/");
			
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			
//			DwsLoginPage dws = new DwsLoginPage(driver);
			
			driver.findElement(By.id("Email")).sendKeys("admin01@gmail.com");
//			dws.username("admin01@gmail.com");
			
			driver.findElement(By.id("Password")).sendKeys("admin02");
//			dws.password("admin02");
			
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
//			dws.Login_Button();
			
			assertEquals("123", "142");
		}
		
		@Test(dependsOnMethods = "dwsLoginWrong")
		public void redBus() 
		{
			driver.get("https://www.redbus.in/");
		}
		
	}

