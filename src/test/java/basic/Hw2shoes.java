package basic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hw2shoes {

	@Test
	public  void  louisVuittonNikeAir1Force () {
		
		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 driver.get("https://in.louisvuitton.com/");
		 
		 driver.close();
	}
	  @Test
	  public  void nike() {
		  
		  WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 
			 driver.get("https://www.nike.com/");
			 
			 driver.close();
	  }
	  
	  @Test
	  public void brunello_cucinelli() {
		  WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 
			 driver.get("https://www.lyst.com/shop/mens-brunello-cucinelli-shoes/");
			 
			 driver.close();
	  }
	  @Test
	  public void puma() {
		
		  WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 
			 driver.get("https://in.puma.com/");
			 
			 driver.close();
	}
	  
	  @Test
	  public void  woodlandworld() {
			
		  WebDriver driver=new ChromeDriver();
			 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			 
			 driver.get("https://www.woodlandworldwide.com/");
			 
			 driver.close();
	}
}
