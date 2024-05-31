package TestNg;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HwTask2 extends BaseClass{
	
@Test
	public void okk() throws InterruptedException {
	
	driver.findElement(By.id("small-searchterms")).sendKeys("Ramu");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
		
	}
	
}
