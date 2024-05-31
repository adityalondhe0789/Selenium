package basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hw1 {
    
	@Test
	public  void titan () {
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.get("https://www.titan.co.in/");
		 
		 driver.close();
	}
	  @Test
	  public  void rado() {
		  
		  WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 
			 driver.get("https://www.rado.com/en_in/");
			 
			 driver.close();
	  }
	  
	  @Test
	  public void casio() {
		  WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 
			 driver.get("https://www.casio.com/in/watches/");
			 
			 driver.close();
	  }
	  @Test
	  public void danielWellington() {
		
		  WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 
			 driver.get("https://in.danielwellington.com/");
			 
			 driver.close();
	}
	  
	  @Test
	  public void tissot() {
			
		  WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 
			 driver.get("https://www.ethoswatches.com/");
			 
			 driver.close();
	}
}
