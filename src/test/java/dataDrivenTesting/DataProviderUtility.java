package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataProviderUtility {

	public static Object[][] dwsLogin1() throws EncryptedDocumentException, IOException {
		Object[][] obj = new Object[2][2];

		FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\Desktop\\Automation login.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		// Sheet Sheet = wb.getSheet("Sheet1");
		Sheet Sheet = wb.getSheet("Sheet3");
		obj[0][0] = Sheet.getRow(0).getCell(0).toString();
		obj[0][1] = Sheet.getRow(0).getCell(1).toString();
		obj[1][0] = Sheet.getRow(1).getCell(0).toString();
		obj[1][1] = Sheet.getRow(1).getCell(1).toString();

		return obj;

//		obj[0][0]="admin01@gmail.com";
//		obj[0][1]="admin01";
//		obj[1][0]="admin02@gmail.com";
//		obj[1][1]="admin02";

	}

}
