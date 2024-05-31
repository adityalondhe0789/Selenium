package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import com.crm.pom.DwsRegister11;
import com.crm.pom.DwsTwitterElement;
public class DwsTwitterLogIn {

	

	@Test
	public void testCase1() {
		
	WebDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	driver.get("https://demowebshop.tricentis.com/login");
	
	DwsRegister11 dws=new DwsRegister11(driver);
	Actions act= new Actions(driver);
	
	act.scrollToElement(DwsTwitterElement);
	
	driver.switchTo(DwsTwitterElement);
	
	}
	
}
