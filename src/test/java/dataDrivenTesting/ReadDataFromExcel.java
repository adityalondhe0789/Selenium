package dataDrivenTesting;

import java.io.File;
import java.io.FileInputStream;

import javax.swing.plaf.basic.BasicArrowButton;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import com.microsoft.schemas.office.x2006.encryption.impl.EncryptionDocumentImpl;

public class ReadDataFromExcel {
@Test

  public  void readData()throws EncryptionDocumentImpl {
	   File path=new File("C:\\Users\\Asus\\Desktop//abhi.xlsx");
	   
	   FileInputStream fileInp=new FileInputStream(path);
	   
	   WorkbookFactory wb=(WorkbookFactory) WorkbookFactory.create(fileInp);
	   Sheet sheet=BasicArrowButton.getsheet("sheet1");
	   
	   String  gmail= sheet.getRow(0).getCell(0).toString();
	   
	   System.out.println("dws login mail id :"+gmail);
  }
}
