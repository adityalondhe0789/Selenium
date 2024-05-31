package parameter;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DataXmlBaseClass extends BaseClassAssingment {

	
	@Test
	public void dws() {
		
		driver.findElement(By.xpath("(//a[contains(text(),'Gift Cards')])[1]")).click();
	    driver.findElement(By.xpath("(//input[@value='Add to cart'])[1]")).click();
	    driver.findElement(By.id("giftcard_1_RecipientName")).sendKeys("adi");
	    driver.findElement(By.id("giftcard_1_RecipientEmail")).sendKeys("aditya@gmail.com");
	    driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("adira");
	    driver.findElement(By.id("giftcard_1_SenderEmail")).sendKeys("arpan@gmail.com");
	    driver.findElement(By.id("giftcard_1_Message")).sendKeys("arpan tere liye");
	    driver.findElement(By.id("addtocart_1_EnteredQuantity")).clear();
	    driver.findElement(By.id("addtocart_1_EnteredQuantity")).sendKeys("5");
	   
		System.out.println("test case 1 executed  " );
		
		
	}
}
