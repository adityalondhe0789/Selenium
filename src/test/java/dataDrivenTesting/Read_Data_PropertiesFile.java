package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByClassName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Read_Data_PropertiesFile {

	@Test
	public void ReadData() throws IOException, InterruptedException {

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("./ConfigerFile/DwsFile.Properties");
		prop.load(fis);

		String url = prop.getProperty("url");

		String userName = prop.getProperty("userName");

		String pass = prop.getProperty("password");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get(url);
		Thread.sleep(2000);
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("Email")).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.id("Password")).sendKeys(pass);
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();

		driver.close();

	}
}
