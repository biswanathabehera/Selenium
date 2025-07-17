package Data_Driven_testing;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_data_form_ExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub

		FileInputStream fis= new FileInputStream("./src/test/java/Book1.xlsx");
		//convert physical file to java object
		Workbook wbf = WorkbookFactory.create(fis);
		//fetching the data from workbook 
		Sheet sh = wbf.getSheet("data");
		//fetch the sheet
		Row r = sh.getRow(0);
		//fetch the Row
		Cell c = r.getCell(0);
		//fetch the data
		//String data= c.getStringCellValue();
    	//double	data1= c.getNumericCellValue();
		String data3 = c.toString();
		//printing the data
		System.out.println(data3);
		//System.out.println(data1);
	}

}
