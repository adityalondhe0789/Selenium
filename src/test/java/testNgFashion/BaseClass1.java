package testNgFashion;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BaseClass1 extends BaseClassShopper1 {

	@Test
	public void updateInfo() throws AWTException, InterruptedException 
	{
//		Actions act=new  Actions(driver);
		
		  driver.findElement(By.xpath("//button[@aria-label='Account settings']")).click();
		
//		 Thread.sleep(1000);
//		 act.moveToElement(myaccount).build().perform();
		 
		 
		  Thread.sleep(2000);
		 driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		 
		 Thread.sleep(2000);
		 
		 driver.findElement(By.xpath("//button[contains(text(),'Edit Profile ')]")).click();
		 
		 //driver.findElement(By.xpath("//input[@id='First Name']")).clear();
		 
		 driver.findElement(By.xpath("//input[@id='First Name']")).sendKeys("ADITYA");
		 
		// driver.findElement(By.xpath("input[@id='Last Name']']")).clear();
		 
		 driver.findElement(By.xpath("input[@id='Last Name']']")).sendKeys("LONDHE");
		 
		
		
		 //driver.findElement(By.xpath("//input[@id='Phone Number']")).clear();
		 
		 driver.findElement(By.xpath("//input[@id='Phone Number']")).sendKeys("9322040987");
		 
		 driver.findElement(By.xpath("//button[@id='submit']")).click();
		 
		driver.switchTo().alert().accept();
		
		
		 
	}
}
