package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelperMethods {
 
	  @Test(priority = 3)
	  
	 public  void main() {
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.get("https://demowebshop.tricentis.com/");
		 
		 driver.close();
	}
	  @Test(priority = 0,invocationCount = 2,threadPoolSize = 2)
	  public  void Rcb() {
		  
		  WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 driver.get("https://www.royalchallengers.com/");
			 
			 driver.close();
	  }
	  
	  @Test(enabled = false)
	  public void csk() {
		  WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 driver.get("https://www.chennaisuperkings.com/");
			 
			 driver.close();
	  }
	  @Test(priority = 2)
	  public void mumbaiIndians() {
		
		  WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			 
			 driver.get("https://www.mumbaiindians.com/");
			 
			 driver.close();
	}

}
