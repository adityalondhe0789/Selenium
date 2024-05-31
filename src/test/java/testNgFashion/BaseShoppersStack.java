package testNgFashion;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import dataDrivenTesting.DataProviderUtility;

public class BaseShoppersStack {

	@Test(dataProvider = "login")
	public void reciver1(String gmail, String pwd) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(gmail);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pwd);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Actions act = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("//a[@id='men']"));
		act.moveToElement(men).build().perform();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//a[text()='T-shirts']")).click();

		List<WebElement> addToCard = driver.findElements(By.xpath("//button[text()='add to cart']"));

		for (WebElement add : addToCard) {

			add.click();
		}

		WebElement meanu = driver.findElement(By.xpath("//button[@aria-controls='account-menu']"));
		act.moveToElement(meanu);
		driver.findElement(By.xpath("//li[text()='Logout']")).click();
		driver.close();
	}

	@DataProvider(name = "login")
	public Object[][] sender() throws EncryptedDocumentException, IOException {
		return DataProviderUtility.dwsLogin1();
	}

}
