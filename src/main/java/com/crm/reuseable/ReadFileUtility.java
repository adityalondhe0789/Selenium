package com.crm.reuseable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadFileUtility {

	public static String readDataFromProperties(String key) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\eclipse-workspace\\com.crm.AdvancedSelenium\\src\\test\\resources\\DemoWebShop\\Login.properties");
		prop.load(fis);
		String data = prop.getProperty(key);
		
		return data;
	}
	
	public static String readDataFromExcel(int value) throws EncryptedDocumentException, IOException {
		File path = new File("C:\\Users\\Asus\\eclipse-workspace\\com.crm.AdvancedSelenium\\src\\test\\resources\\DemoWebShop\\Automation login.xlsx");
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		org.apache.poi.ss.usermodel.Sheet sheet = wb.getSheet("Sheet1");
		String data = sheet.getRow(0).getCell(value).toString();
		
		return data;
		
	}
}
