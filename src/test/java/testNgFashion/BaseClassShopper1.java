package testNgFashion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import basic.BerforeSuite;

public class BaseClassShopper1 {

	
	WebDriver driver = new ChromeDriver();

	@BerforeSuite
	public void beforeSuite() {
		System.out.println("connection to database");
	}

	@BeforeClass
	public void beforeTest() {
		System.out.println("predection for test runner");
	}

	@BeforeClass
	public void login() throws InterruptedException {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		Thread.sleep(2000);
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {

		driver.findElement(By.xpath("//button[@id='loginBtn']")).click();

		Thread.sleep(1000);

		driver.findElement(By.id("Email")).sendKeys("adityalondhe19@gmail.com");

		//Thread.sleep(1000);

		driver.findElement(By.id("Password")).sendKeys("Shrawani@19");

		//Thread.sleep(1000);

		driver.findElement(By.xpath("//span[text()='Login']")).click();

	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("aftermethod");
	}

	@AfterClass
	public void afterClass() {
		driver.close();
	}

	@AfterTest
	public void afterTest() {
		System.out.println("--------");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("disconnection to db ");
	}
}
