package basic;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hw3QspiderForm {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.navigate().to("https://demoapps.qspiders.com/");
			
		
		driver.findElement(By.xpath("//div[text()='Explore more']")).click();
		
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		
		driver.findElement(By.xpath("//input[@placeholder='Type something']")).sendKeys("Shubh");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Aditya Londhe");
		
		driver.findElement(By.xpath("//input[@placeholder='Re-Type Password']")).sendKeys("Aditya");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter a valid e-mail']")).sendKeys("adityalondhe0789@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='URL']")).sendKeys("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter only digits']")).sendKeys("741852");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter only numbers']")).sendKeys("789456123");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter alphanumeric value']")).sendKeys("Aditya@0789");
		driver.findElement(By.xpath("//input[@placeholder='Min 6 chars.']")).sendKeys("aditya");
		driver.findElement(By.xpath("//input[@placeholder='Max 6 chars.']")).sendKeys("Londhe@Aditya");
		
		driver.findElement(By.xpath("//input[@placeholder='Text between 5 - 10 chars length']")).sendKeys("85522222");
		driver.findElement(By.xpath("//input[@placeholder='Min value is 6']")).sendKeys("741258");
		driver.findElement(By.xpath("//input[@placeholder='Max value is 6']")).sendKeys("78945662");
		
		driver.findElement(By.xpath("//input[@placeholder='Number between 6 - 100']")).sendKeys("852741963");
		
		
		List<WebElement> textfield = driver.findElements(By.xpath("//div[@class='form-group p-[1.5] my-3']/div/input"));
		
		String value [] = {"Shubh","Aditya Londhe","Aditya","adityalondhe0789@gmail.com","https://demoapps.qspiders.com/","741852","789456123","Aditya@0789","aditya","Londhe@Aditya","85522222","741258","78945662","852741963"};
		
		
		int i=0;
		for (String web: value) {
			
			web.sendKeys(value[i++]);
			
		}
		
		
		
	}
}
