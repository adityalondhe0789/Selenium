package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderBasic {

	@Test(dataProvider = "login")

//	public void reciver(String gmail,String pwd) throws InterruptedException {
//		
//		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.get("https://demowebshop.tricentis.com/");
//		driver.findElement(By.cssSelector("a[class='ico-login']")).click();
//		driver.findElement(By.id("Email")).sendKeys(gmail);
//		driver.findElement(By.id("Password")).sendKeys(pwd);
//		driver.findElement(By.cssSelector("input[value='Log in']")).click();
//		Thread.sleep(2000);
//		driver.close();
//		
//		
//		
//	}
	public void reciver1(String gmail, String pwd) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(gmail);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		// driver.findElement(By.xpath("//span[text()='Login']")).click();

		driver.close();
	}

//	@org.testng.annotations.DataProvider(name="login")
//	public Object[][] sender(){
//		Object[][]obj=new Object[2][2];
//		obj[0][0]="admin01@gmail.com";
//		obj[0][1]="admin01";
//		obj[1][0]="admin02@gmail.com";
//		obj[1][1]="admin02";
//		return obj;
//		
//	}
	@DataProvider(name = "login")
	public Object[][] sender() throws EncryptedDocumentException, IOException {
		return DataProviderUtility.dwsLogin1();
	}
}
