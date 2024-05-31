package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class Hw1B  extends Hw1BaseClass{

	@Test(dataProvider = )
	public static Object[][] dwsLogin1() throws EncryptedDocumentException, IOException {
		Object[][]obj=new Object[2][2];

		
		FileInputStream fis=new FileInputStream("C:\\Users\\Asus\\Desktop\\Automation login.xlsx");
		
		Workbook wb=WorkbookFactory.create(fis);
		
		//Sheet Sheet = wb.getSheet("Sheet1");
		Sheet Sheet = wb.getSheet("Sheet3");
		obj [0][0]=Sheet.getRow(0).getCell(0).toString();
		obj[0][1]=Sheet.getRow(0).getCell(1).toString();
		obj[1][0]=Sheet.getRow(1).getCell(0).toString();
		obj[1][1]=Sheet.getRow(1).getCell(1).toString();
		
		return obj;
	}
	@DataProvider(name = "login")
	public Object [][] sender() throws EncryptedDocumentException, IOException{
		return DataProviderUtility.dwsLogin1();
	}
	
}
