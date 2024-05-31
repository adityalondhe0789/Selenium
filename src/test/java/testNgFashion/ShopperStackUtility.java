package testNgFashion;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ShopperStackUtility {

	public static Object[][] dwsLogin1() throws EncryptedDocumentException, IOException {
		Object[][] obj = new Object[1][1];

		FileInputStream fis = new FileInputStream("C:\\Users\\Asus\\Desktop\\Automation login.xlsx");

		Workbook wb = WorkbookFactory.create(fis);

		// Sheet Sheet = wb.getSheet("Sheet1");
		Sheet Sheet = wb.getSheet("Sheet3");
		obj[0][0] = Sheet.getRow(0).getCell(0).toString();

		return obj;
	}
}
