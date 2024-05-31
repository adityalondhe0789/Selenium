package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class OddEven {

	@Test
	public void OddEven() throws EncryptedDocumentException, IOException {

		File path = new File("C:\\Users\\Asus\\Desktop\\Automation login.xlsx");

		FileInputStream fis = new FileInputStream(path);

		Workbook wb = WorkbookFactory.create(fis);

		Sheet sheet = wb.getSheet("Sheet2");

		int row = sheet.getPhysicalNumberOfRows();
		int column = sheet.getRow(0).getPhysicalNumberOfCells();
		
		
		for (int i = 0; i < row; i++) {

			for (int j = 0; j < column; j++) {

				String s1 = sheet.getRow(i).getCell(j).toString();

				double i1 = Double.parseDouble(s1);
				int i2 = (int) i1;

				if (i2 % 2 == 0) {
					System.out.println("Even number " + i2);
				} else {
					System.out.println("Odd number " +  i2);
				}

			}
		}
	}
}
