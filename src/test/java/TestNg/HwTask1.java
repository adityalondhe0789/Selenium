package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HwTask1 extends BaseClass{
	@Test
 public void ok() {
	 
	 driver.findElement(By.xpath("(//div[@class='picture'])[6]")).click();
	 
	 driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Shubham Shejpure");
	 
	 driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("sshejpure@gmail.com");
	 
	 driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("Aditya");
	 
	 driver.findElement(By.xpath("//input[@class='sender-email']")).sendKeys("admin01@gmail.com");
	 
	 driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys(" Tere liye B-DAY gift");
	 
	 
	 
 }
}
