package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DepndsOnMethod {

	@Test(priority = 2)
	public void createAcc() {

		System.out.println("ACC Create");
		
		WebDriver driver=new ChromeDriver();
		 
	     driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://www.royalchallengers.com/");
		 
		 driver.close();
	}

	@Test(priority = 0,dependsOnMethods = "createAcc")
	public void modifyAcc() {

		System.out.println("ACC MOdify");
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://www.mumbaiindians.com/");
		 
		 driver.close();
	}

	@Test(priority = 1,dependsOnMethods = "createAcc")
	public void deleteAcc() {

		System.out.println("ACC Delete");
	}

	

}
