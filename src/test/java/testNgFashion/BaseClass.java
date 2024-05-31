package testNgFashion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BaseClass extends BaseClassShopper {

	
	@Test
	public void addToCart() throws InterruptedException {
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);

		WebElement men = driver.findElement(By.xpath("//a[text()='Men']"));

		act.moveToElement(men).build().perform();
		Thread.sleep(2000);

		WebElement tshirt = driver.findElement(By.xpath("//a[text()='T-shirts']"));

		tshirt.click();

		List<WebElement> list = driver.findElements(By.xpath("//button[text()='add to cart']"));

		for (WebElement web : list) {
			
			Thread.sleep(1000);
			web.click();
			
		}

	}
}
