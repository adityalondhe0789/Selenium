package PageObjectModel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.crm.pom.DwsRegister11;

public class registerDws {

	
	@Test
	public void login() throws InterruptedException{
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demowebshop.tricentis.com/login");
		
		DwsRegister11 dws=new DwsRegister11(driver);
		
		
		Thread.sleep(2000);
		dws.registerClick();
		Thread.sleep(2000);
		
		dws.maleClick();
		Thread.sleep(2000);
		dws.firstNameTextFildClick();
		dws.firstNameTextFild("Aditya");
		Thread.sleep(2000);
		dws.clickLastName();
		dws.lastName("Londhe");
		Thread.sleep(2000);
		dws.clickEmail();
		dws.email("adityalondhe0765@gmail.com");
		Thread.sleep(2000);
		dws.clickPassword();
		dws.password("adira@123");
		Thread.sleep(2000);
		dws.clickConfirmPass();
		dws.confirmPasswor("adira@123");
		Thread.sleep(2000);
		dws.register_button.click();
	}
}
