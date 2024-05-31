package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class HwCheckPrime {
	
		@Test
			public void readData() throws EncryptedDocumentException, IOException {
				File path = new File("C:\\\\Users\\\\Asus\\\\Desktop\\\\Automation login.xlsx");
				FileInputStream fis = new FileInputStream(path);
				Workbook wb=WorkbookFactory.create(fis);
				Sheet sheet=wb.getSheet("Sheet2");
				int row = sheet.getPhysicalNumberOfRows();
				int column=sheet.getRow(0).getPhysicalNumberOfCells();
				System.out.println(row);
				System.out.println(column);
				for (int i = 0; i < row; i++) {

					for (int j = 0; j < column; j++) {
						String s1=sheet.getRow(i).getCell(j).toString();
						if (isPrime(s1)) {
							System.out.println("given No "+s1+" is a prime no");
							
						}
						else {
							System.out.println("given No "+s1+" is not a prime no");
							
						}
					}
				}
				
				
				

			}	public boolean isPrime(String row) {
				double num =Double.parseDouble(row);
				for(int i=2;i<num;i++) {
					if (num%i==0) {
						return false;
						
					}
					
				}
				return true;
				
			}
			

	}
	

