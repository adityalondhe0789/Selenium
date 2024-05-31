package TestNg;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DemoWwebShop extends BaseClass {
@Test
	public void  add() {
	
	driver.findElement(By.xpath("//a[contains(text(), 'Digital downloads' )]")).click();
	
	List<WebElement> addto = driver.findElements(By.xpath("//input[@value='Add to cart']"));
	
	for (WebElement web : addto) {
		
		web.click();
	}
	
	
	
	}
}
