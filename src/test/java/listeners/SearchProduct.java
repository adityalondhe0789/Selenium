package listeners;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SearchProduct {

	@Test(retryAnalyzer = com.crm.listenersCode.ListenersRetry.class)
	public void searchProduct() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Ramu");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		//assertEquals("om", "annya");
		
		driver.close();
		
	}
}
