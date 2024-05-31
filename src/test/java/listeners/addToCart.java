package listeners;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.listenersCode.BaseClass;

@Listeners(com.crm.listenersCode.DwsLogin.class)

public class addToCart  extends BaseClass {
	
  @Test
  public void AddToCart() throws InterruptedException {
	  driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
	 List<WebElement> addToCart = driver.findElements(By.xpath("//input[@value='Add to cart']"));
	for (WebElement web : addToCart) {
		web.click();
		Thread.sleep(2000);
	}
  }
}
