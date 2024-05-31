package listeners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NetworkFailure {

	
	@Test(retryAnalyzer = com.crm.listenersCode.NetWorkRetry.class)
	
	
	public void  searchproduct() {
		
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.redbus.in/");
		 assertEquals("okk", "okk");
		 
	}
	
	
	
	
	
}
