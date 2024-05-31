package listeners;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.crm.listenersCode.BaseClassDws;

public class CaptureScreenShortOnFaild extends BaseClassDws {

	
	@Test
	public void dwsLonginCorrect() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		DwsLoginPage dws = new DwsLoginPage(driver);
		
		dws.username("admin01@gmail.com");
		dws.password("admin01");
		dws.login_button();
		
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
		
	}
	
	@Test
	public void dwsLogInWrong() {
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		
		DwsLoginPage dws = new DwsLoginPage(driver);
		
		dws.username("admin01@gmail.com");
		dws.password("admin02");
		dws.login_button();
		
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	}
	
	
	@Test
	public void loginRedBus() {
		driver.get("https://www.redbus.in/");
		assertEquals("abhi", "bus");
	}
	
}
